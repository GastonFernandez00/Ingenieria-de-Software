package paquete;
import javax.swing.JPanel;

public class Contrarreloj extends Modos {

    public Contrarreloj(JPanel panelPrincipal){
        super(panelPrincipal,new TimerDescendente());
    }
    
    public Contrarreloj(JPanel panelPrincipal,int TiempoInicial){
        super(panelPrincipal,new TimerDescendente(TiempoInicial));
    }
}
