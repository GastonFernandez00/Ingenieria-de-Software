package com.snake;

import javax.swing.JOptionPane;

public class HiloAvanzar extends Thread{
	
	PanelSnake panel;
	boolean estado = true;
	
	/** Constructor **/
	HiloAvanzar(PanelSnake panel){
		this.panel = panel;
	}
	
	/** Mientras el estado sea verdadero continua el snake **/
	public void run() {
		// Establece un valor inicial para la velocidad del snake
		int velInicial = 120;
		
		while(estado) {
			panel.Avanzar();
			panel.repaint();
			
			// Manda a dormir el hilo mientras velInicial-puntaje/2.5 sea mayor a 5
			try { 
				// Si velInicial-puntaje/2.5 es menor o igual a 5, se lanza una excepcion
				if(velInicial-(int)(PanelSnake.puntaje/2.5) <= 5){
					throw new IllegalArgumentException();
				}
				Thread.sleep(velInicial-(int)(PanelSnake.puntaje/2.5)); // Aumentamos la velocidad con el puntaje
			}
			catch( InterruptedException e ) { e.printStackTrace(); System.exit(0);}
			
			// Se atrapa la excepcion y se muestra un mensaje de maximo puntaje alcanzado
			catch( IllegalArgumentException a){
				JOptionPane.showMessageDialog(panel, "Maximo puntaje alcanzado");
					panel.inicioSnake();
			 }
		
		}
	}

	/** Cambia el estado del hilo a falso, deteniendo el hilo **/
	public void Parar() {
		this.estado = false;
	}
	
}
