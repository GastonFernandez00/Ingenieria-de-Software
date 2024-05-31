package com.snake;

public class HiloAvanzar extends Thread{
	
	PanelSnake panel;
	boolean estado = true;
	
	/** Constructor **/
	HiloAvanzar(PanelSnake panel){
		this.panel = panel;
	}
	
	/** Mientras el estado sea verdadero continuar� el snke **/
	public void run() {
		
		while(estado) {
			panel.Avanzar();
			panel.repaint();
			
			try {
				Thread.sleep(150-3*PanelSnake.puntaje); // Aumentamos la velocidad con el puntaje
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void Parar() {
		this.estado = false;
	}
	
}
