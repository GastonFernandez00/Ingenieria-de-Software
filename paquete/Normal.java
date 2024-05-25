package paquete;

import javax.swing.JPanel;

public class Normal extends Modos {
    public Normal(JPanel panelPrincipal){
        super(panelPrincipal,new TimerAscendente());
    }
}
