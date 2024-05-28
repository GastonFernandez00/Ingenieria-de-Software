package paquete;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * La clase abstracta Modos representa los diferentes modos de juego.
 * Proporciona métodos y atributos comunes a todos los modos.
 */
public abstract class Modos {
    
    public static Timer timer;
    private JLabel lblNewLabelTiempo;
	public static JLabel lblTiempo;
    
    /**
     * Constructor de la clase Modos.
     * @param panelPrincipal el panel principal donde se mostrarán los elementos gráficos.
     * @param timer el temporizador utilizado en el modo.
     */
    Modos(JPanel panelPrincipal, Timer timer){
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

    public abstract String getTipo();


    // void establecerBarreras(Barreras barr){
    //     this.barr = barr;
    // }

}
