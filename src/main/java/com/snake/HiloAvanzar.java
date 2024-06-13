package com.snake;

import javax.swing.JOptionPane;

public class HiloAvanzar extends Thread{
	
	PanelSnake panel;
	boolean estado = true;
	
	/** Constructor **/
	HiloAvanzar(PanelSnake panel){
		this.panel = panel;
	}
	
	/** Mientras el estado sea verdadero continuar� el snke **/
	public void run() {
		int velInicial = 120;
		
		while(estado) {
			panel.Avanzar();
			panel.repaint();
			
			try {
				if(velInicial-(int)(PanelSnake.puntaje/2.5) <= 5){
					throw new IllegalArgumentException();
				}
				Thread.sleep(velInicial-(int)(PanelSnake.puntaje/2.5)); // Aumentamos la velocidad con el puntaje
			}
			catch( InterruptedException e ) { e.printStackTrace(); System.exit(0);}
			catch( IllegalArgumentException a){
				JOptionPane.showMessageDialog(panel, "Maximo puntaje alcanzado");
					panel.inicioSnake();
			 }
		
		}
	}
	public void Parar() {
		this.estado = false;
	}
	
}
