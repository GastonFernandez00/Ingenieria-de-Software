package paquete;

import javax.swing.JPanel;

public class ConBordes extends Modos{
    
    public ConBordes(JPanel panelPrincipal, PanelSnake snake){
        super(panelPrincipal, new TimerAscendente());
        snake.setBarreras();
    }

    @Override
    public String getTipo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTipo'");
    }
    
}
