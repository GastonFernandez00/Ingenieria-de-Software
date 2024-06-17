package com.snake;

import java.awt.Color;
import java.awt.Graphics;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelSnake extends JPanel {

	boolean barreras = false;
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
		contadorFinEfecto = 0;
		boolean existe = false;
		int x;
		int y;

		// Si se selecciona el modo de juego con barreras se limita el area donde puede aparecer la comida
		if(barreras){ 
			x = (int)(Math.random()*(cant-2))+1; // genera numero entre 1 y cant-1
			y = (int)(Math.random()*(cant-2))+1;
		}else{
			x = (int)(Math.random()*cant);
			y = (int)(Math.random()*cant);
		}

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

		/*Si la serpiente se mueve fuera del tablero aparecerá del otro lado */
		int[] newHeadSnake = { Math.floorMod  (headSnake[0] + agregarX, cant), Math.floorMod(headSnake[1] + agregarY, cant)};
		
		/*Flag que indica que la serpiente chocó con la barrera*/
		boolean choque = false;
		/* Busca si la nueva pocision pertenece a la pocision de la serpiente (perdiste) o sino avanza*/
		boolean existe = false;
		boolean termino = false;

		/* Si terminó el tiempo asignado, la comida vuelve a ser CNegra */		
		if(finalizaEfectoComida == true){
			tipoDeComida = new CNegra();
			finalizaEfectoComida = false;
			repaint();
		}

		
		/*Si se selecciona el modo de juego con barreras se limita el area de juego */
		if(barreras == true){

			if (newHeadSnake[0] == 0 || newHeadSnake[0] >= cant-1 || newHeadSnake[1] == 0 || newHeadSnake[1] >= cant-1) {
				// Si se choca con las barreras levanta un flag
				choque = true; 
			}
		}
		
		// Pregunta si el tiempo actual es igual al final. Si es asi, termino el juego
		if(Modos.timer.getTiempoInicial() == Modos.timer.getTiempoFinal()){
			// Si se termina el tiempo, levanta un flag
			termino = true;
		} 

		// Pregunta si la nueva cabeza del snake es igual a alguna parte del snake
		for(int i = 0; i<snake.size(); i++) {
			if(newHeadSnake[0]==snake.get(i)[0] && newHeadSnake[1]==snake.get(i)[1] ) {
				existe = true;
				break;
			}
		}

		/* Si te chocaste contra la barrera, contigo mismo ó terminó el tiempo
		 * se termina el juego, se muestra el puntaje obtenido y reinicia.
		 */
		if(existe || termino || choque) {
			JOptionPane.showMessageDialog(this, "Game Over");
			inicioSnake();
			JFrameSnake.lblPuntaje.setText(""+puntaje);
			Modos.lblTiempo.setText(""+Modos.timer.getInicial());
		}
		/* Si no ocurre nada de esto, puede ser comida, ó un espacio vacío */
		else{
			if(newHeadSnake[0]==comida[0] && newHeadSnake[1]==comida[1]) {
				/*	Si la nueva cabeza del snake es igual a la comida, se come la comida
				 * y se genera una nueva comida
				 */
				snake.add(newHeadSnake);
				puntaje += tipoDeComida.getMultiplicador();
				JFrameSnake.lblPuntaje.setText(""+puntaje);
				generarComida();
				
			}
			else { //Es simplemente un espacio vacio
				snake.add(newHeadSnake);
				snake.remove(0);
			}
		}

		/* Si ha pasado 1 segundo, actualiza el tiempo */
		if(calcTiempo() == true){
			Modos.timer.modificarTiempo();
			Modos.lblTiempo.setText(""+Modos.timer.getInicial());
			
			/*
			 * Si la comida es de tipo "Normal" no se hace nada, sino se aumenta el contador
			 * para que la comida vuelva a ser "Normal" luego de 5 segundos.
			 */
			if(!tipoDeComida.getTipo().equals("Normal")) contadorFinEfecto++;
			else contadorFinEfecto = 0;
			
			// Pregunta si ya pasó el tiempo en que se podía conseguir la comida especial
			if(contadorFinEfecto == 5){ 
				finalizaEfectoComida = true;
				contadorFinEfecto = 0;
			}
		}
	}

	/* 
	 * Calcula el tiempo transcurrido. Si es menor a 1 segundo, retorna false
	 * sino, retorna true y actualiza el tiempo 
	 */
	private boolean calcTiempo(){
		int newEpoc = (int)Instant.now().getEpochSecond();
		int aumento = newEpoc - lastEpoch;
		if(aumento < 1){
			return false;
		}
		lastEpoch = newEpoc;
		return true;
	}

	// Cambia la direccion a una nueva
	public void cambiarDireccion(String newDir) {
		
		if( (this.dirActual.equals("de") || this.dirActual.equals("iz")) && (newDir.equals("ar") || newDir.equals("ab")))
				this.dirNueva = newDir;
		if( (this.dirActual.equals("ar") || this.dirActual.equals("ab")) && (newDir.equals("de") || newDir.equals("iz")))
			this.dirNueva = newDir;
	}

	// Establece que la direccion actual es igual a la nueva
	public void igualarDireccion() {
		this.dirActual = this.dirNueva;
	}
	
	/*
	 * 	Al iniciar el snake, se re-establece el timer, se vacía el snake, se reubica y
	 * su puntaje se establece en 0. 
	 * 	Además se genera una nueva comida.
	 */
	public void inicioSnake() {
		Modos.timer.reiniciarTimer();
		snake.clear();
		int[] par1 = { (cant-1)/2, (cant-1)/2 };
		int[] par2 = { ((cant-1)/2)+1  , (cant-1)/2 };
		snake.add(par1);
		snake.add(par2);
		dirActual = "de";
		dirNueva = "de";
		puntaje = 0;
		generarComida();
	}

	// Establece el flag para que se generen las barreras.
	public void setBarreras(){
		barreras = true;
	}
}
