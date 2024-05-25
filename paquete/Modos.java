package paquete;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Modos {
    
    static Timer timer;
    private JLabel lblNewLabelTiempo;
	public static JLabel lblTiempo;
    
    Modos(JPanel panelPrincipal,Timer timer){
        Modos.timer = timer;
        lblNewLabelTiempo = new JLabel("Tiempo :");
		lblNewLabelTiempo.setFont(new Font("Consolas", Font.BOLD, 22));
		lblNewLabelTiempo.setBounds(30, 15, 119, 20);
		panelPrincipal.add(lblNewLabelTiempo);
		
		lblTiempo = new JLabel( timer.getInicial() ); // <----- Tiempo Inicial
		lblTiempo.setFont(new Font("Consolas", Font.BOLD, 22));
		lblTiempo.setBounds(130, 15, 40, 20);
		panelPrincipal.add(lblTiempo);
    }

    // void establecerBarreras(Barreras barr){
    //     this.barr = barr;
    // }



}
