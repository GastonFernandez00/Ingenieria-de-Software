package com.snake;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * La clase Menu representa una ventana de menú para un juego de Snake.
 * Proporciona opciones para iniciar el juego y obtener la opción seleccionada.
 */
public class Menu extends javax.swing.JFrame{
    
    private int opcion;

    /**
     * Crea una nueva instancia de la clase Menu.
     * Configura el tamaño y la ubicación de la ventana.
     * Llama al método crearFunciones para crear las funciones del menú.
     */
    public Menu(){
        setBounds(0,0,559, 606);
        setLocationRelativeTo(null);
        crearFunciones();
    }

    /**
     * Crea las funciones del menú.
     * Muestra un cuadro de diálogo con opciones para iniciar el juego.
     * Almacena la opción seleccionada en la variable de instancia opcion.
     */
    private void crearFunciones(){
        String B[] = {"Normal","Contrarreloj","Con Bordes"};
        this.opcion = JOptionPane.showOptionDialog(this, "Opciones para Iniciar el Juego", "Opciones - Snake",
         JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, B, accessibleContext);
    }

    /**
     * Obtiene la opción seleccionada del menú.
     * @return la opción seleccionada del menú.
     */
    public int getOpcion(){ return this.opcion; }

}
