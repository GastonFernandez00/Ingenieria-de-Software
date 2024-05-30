package paquete;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelFondo extends JPanel {

	boolean barreras = false;

	int tam;  // --> tama�o del lado del panel en pixeles
	int cant; // --> cantidad de cuadrados por lado
	int tamC; // --> tama�o de cada cuadrado en pixeles
	
	public PanelFondo(int tam, int cant) {
		this.tam = tam;
		this.cant = cant;
		this.tamC = tam / cant;

	}
	
	public void paint(Graphics dibujo) {
		
		super.paint(dibujo);
		if(barreras) {
			dibujarConBordes(dibujo);
		} else {
			dibujarSinBordes(dibujo);
		}
	}

	private void dibujarSinBordes(Graphics dibujo) {
		dibujo.setColor(new Color(114, 144, 7));
		
		for (int i = 0; i < cant; i++) {
			for (int j = 0; j < cant; j++) {
				dibujo.fillRect(tamC*i, tamC*j, tamC-1, tamC-1);
			}
		}
	}

	private void dibujarConBordes(Graphics dibujo) {
		dibujo.setColor(new Color(114, 144, 7)); // Color verde
		
		for (int i = 0; i < cant; i++) {
			for (int j = 0; j < cant; j++) {
				if (i == 0 || j == 0 || i == cant-1 || j == cant-1) {
					dibujo.setColor(new Color(0, 0, 0)); // Color negro para los bordes
					dibujo.fillRect(tamC*i, tamC*j, tamC, tamC);
					dibujo.setColor(new Color(114, 144, 7)); // Vuelve a establecer el color a verde para el interior
				} else {
					dibujo.fillRect(tamC*i, tamC*j, tamC-1, tamC-1);
				}
			}
		}
	}

	public void setBarreras(){
		barreras = true;
	}

}
