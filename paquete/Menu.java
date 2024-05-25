package paquete;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame{
    private int opcion;


    public Menu(){
        setBounds(0,0,559, 606);
        setLocationRelativeTo(null);
        crearFunciones();
    }

    private void crearFunciones(){
        String B[] = {"Normal","Contrarreloj","Con Bordes"};
        this.opcion = JOptionPane.showOptionDialog(this, "Opciones para Iniciar el Juego", "Opciones - Snake",
         JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, B, accessibleContext);

       // JOptionPane.showMessageDialog(this, "Opción seleccionada: "+B[opcion]);



    }

    public int getOpcion(){ return this.opcion; }

}
