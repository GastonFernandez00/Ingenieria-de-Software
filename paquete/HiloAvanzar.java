package paquete;

import java.awt.*;

public class HiloAvanzar extends Thread{
	
	PanelSnake panel;
	public boolean estado = true;
	
	/** Constructor **/
	public HiloAvanzar(PanelSnake panel){
		this.panel = panel;
	}
	
	/** Mientras el estado sea verdadero continuar� el snke **/
	public void run() {
		
		while(estado) {
			panel.Avanzar();
			panel.repaint();
			Toolkit.getDefaultToolkit().sync();
			
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
