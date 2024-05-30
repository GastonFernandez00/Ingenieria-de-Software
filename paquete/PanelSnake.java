package paquete;

import java.awt.Color;
import java.awt.Graphics;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelSnake extends JPanel {

	int lastEpoch = (int)Instant.now().getEpochSecond();


	boolean finalizaEfectoComida = false;
	int contadorFinEfecto = 0;
	int tam;  // --> tama�o del lado del panel en pixeles
	int cant; // --> cantidad de cuadrados por lado
	int tamC; // --> tama�o de cada cuadrado en pixeles
	
	List<int[]> snake = new ArrayList<>(); // --> SNAKE
	int[] comida = new int [2];  // ------------> COMIDA
	Comidas tipoDeComida = new CRoja();
	
	String dirActual = "de"; // --> Direccion a donde se esta moviendo el snake
	String dirNueva = "de";   // --> Nueva Direccion que apretemos
	
	Thread hilo;
	HiloAvanzar h1;
	
	public static int puntaje;
	
	/** ---------------- Constructor ---------------- **/
	public PanelSnake(int tam, int cant) {
		this.tam = tam;
		this.cant = cant;
		this.tamC = tam / cant;
		// Creamos dos pares ordenados que ser� el snake y se lo agregamos
		inicioSnake();
		
		generarComida();
		
		h1 = new HiloAvanzar(this);
		hilo = new Thread(h1);
		hilo.start();
		

	}
	/** Metodo para graficar a la serpiente y la comida**/
	public void paint(Graphics dibujo) {
		
		super.paint(dibujo);
		dibujo.setColor(new Color(0, 1, 0));
		
		// Dibujando la Serpiente
		for(int[] par : snake ) {
			dibujo.fillRect(par[0]*tamC, par[1]*tamC, tamC-1, tamC-1);
		}
		// Dibujando la comida : esta compuesto de 4 cuadratitos (cube)
		pintarComida(dibujo);
	}

	public void pintarComida(Graphics dibujo){
		int cube = tamC/3;
		dibujo.setColor(tipoDeComida.getColor());
		dibujo.fillRect((comida[0]*tamC)+cube, comida[1]*tamC, cube, cube);
		dibujo.fillRect((comida[0]*tamC), (comida[1]*tamC)+cube, cube, cube);
		dibujo.fillRect((comida[0]*tamC)+2*cube, (comida[1]*tamC)+cube, cube, cube);
		dibujo.fillRect((comida[0]*tamC)+cube, comida[1]*tamC+2*cube, cube, cube);
	}
	/** Metodo para generar Comida **/
	public void generarComida() {
		boolean existe = false;
		int x = (int)(Math.random()*cant);
		int y = (int)(Math.random()*cant);
		
		for(int [] par : snake) {
			if(par[0] == x && par[1] == y) {
				existe = true;   // -----------> Confirma que esa ubicacion ya existe par el snake
				generarComida();  // ----------> Vuelve a tratar de crear otra comida con otra ubicacion
				break;    // ------------------> Sale del for
			}
		}
		if(!existe) {
			Random r = new Random();

			if(r.nextInt(1,101) < 20){
				int i = r.nextInt(1,3);
				switch (i) {
					case 1:
						break;
					default:
						tipoDeComida = new CRoja();
						break;
				}

			}
			else{
				tipoDeComida = new CNegra();
			}
			
			this.comida[0] = x;
			this.comida[1] = y;
		}
	}
	/** Metodo para avanzar **/
	public void Avanzar() {
		
		igualarDireccion(); // Cada vez que da un paso, la nueva direccion es ahora la direccion actual
		
		int[] headSnake = snake.get(snake.size()-1); // --> Pocision de la cabeza del Snake
		int agregarX = 0;
		int agregarY = 0;
		
		switch(dirActual) {
		case "de":agregarX = 1; break;
		case "iz":agregarX = -1; break;
		case "ar":agregarY = -1; break;
		case "ab":agregarY = 1; break;
		}

		int[] newHeadSnake = { Math.floorMod  (headSnake[0] + agregarX, cant), Math.floorMod(headSnake[1] + agregarY, cant)};
		
		/** Busca si la nueva pocision pertenece a la pocision de la serpiente (perdiste) o sino avanza**/
		boolean existe = false;

		/* Determina si se alcanzó el tiempo límite */
		boolean termino = false;

		if(finalizaEfectoComida == true){
			tipoDeComida = new CNegra();
			finalizaEfectoComida = false;
			//TODO: falta repintar el cuadro de comida
			repaint();
		}

		if(Modos.timer.getTiempoInicial() == Modos.timer.getTiempoFinal()){
			termino = true;
		} 

		for(int i = 0; i<snake.size(); i++) {
			if(newHeadSnake[0]==snake.get(i)[0] && newHeadSnake[1]==snake.get(i)[1] ) {
				existe = true;
				break;
			}
		}
		
		/*	Si existe, te chocaste contigo mismo, y se reinicia el snake y el puntaje
		* 	Si termino el tiempo, se reinicia el snake y el puntaje
		*/
		if(existe || termino) { 
			JOptionPane.showMessageDialog(this, "GameOver");
			inicioSnake();
			JFrameSnake.lblPuntaje.setText(""+puntaje);
			Modos.timer.reiniciarTimer();
			Modos.lblTiempo.setText(""+Modos.timer.getInicial());
			
		}else {   // Si no existe ni terminó, puede ser la comida o espacio vacio
			if(newHeadSnake[0]==comida[0] && newHeadSnake[1]==comida[1]) {
				snake.add(newHeadSnake);
				puntaje += tipoDeComida.getMultiplicador();
				JFrameSnake.lblPuntaje.setText(""+puntaje);
				generarComida();
				producirEfectoComida();
				
			}else {
				snake.add(newHeadSnake);
				snake.remove(0);
			}
		}

		/*
		 * Pregunta si pasó un segundo para actualizar el tiempo
		 */
		if(calcTiempo() == true){
			Modos.timer.modificarTiempo();
			Modos.lblTiempo.setText(""+Modos.timer.getInicial());
			
			if(!tipoDeComida.getTipo().equals("Normal")) contadorFinEfecto++;
			else contadorFinEfecto = 0;
			if(contadorFinEfecto == 5){ //Tiempo para poder conseguir la "fruta"
				finalizaEfectoComida = true;
				contadorFinEfecto = 0;
			}
			
		}
	}

	private void producirEfectoComida(){
		
	}
	

	/* 
	 * Método que calcula el tiempo transcurrido desde el último segundo.
	 * Si ha pasado un segundo, retorna true.
	 */
	public boolean calcTiempo(){
		int newEpoc = (int)Instant.now().getEpochSecond();
		int aumento = newEpoc - lastEpoch;
		if(aumento < 1){
			return false;
		}
		lastEpoch = newEpoc;
		return true;
	}

	public void cambiarDireccion(String newDir) {
		
		if( (this.dirActual.equals("de") || this.dirActual.equals("iz")) && (newDir.equals("ar") || newDir.equals("ab")))
				this.dirNueva = newDir;
		if( (this.dirActual.equals("ar") || this.dirActual.equals("ab")) && (newDir.equals("de") || newDir.equals("iz")))
			this.dirNueva = newDir;
	}
	public void igualarDireccion() {
		this.dirActual = this.dirNueva;
	}
	public void inicioSnake() {
		snake.clear();
		int[] par1 = { (cant-1)/2, (cant-1)/2 };
		int[] par2 = { ((cant-1)/2)+1  , (cant-1)/2 };
		snake.add(par1);
		snake.add(par2);
		dirActual = "de";
		dirNueva = "de";
		puntaje = 0;
	}
	public Integer getTam() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getTam'");
	}
    public Integer getCant() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCant'");
    }
    public Integer getTamC() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTamC'");
    }
    public Object geth1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'geth1'");
    }
    public Object gethilo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gethilo'");
    }
}






























// asd