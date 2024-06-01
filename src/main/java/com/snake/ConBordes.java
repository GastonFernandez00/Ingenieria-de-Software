package com.snake;

import javax.swing.JPanel;
import javax.swing.plaf.PanelUI;

public class ConBordes extends Modos{
    JPanel panelPrincipal;
    PanelSnake snake;

    public ConBordes(JPanel panelPrincipal, PanelSnake snake){
        super(panelPrincipal, new TimerAscendente());
        this.panelPrincipal = panelPrincipal;
        this.snake = snake;
        snake.setBarreras();
    }

    @Override
    public String getTipo() {
        return "Con Bordes";
    }
    
    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public PanelSnake getSnake() {
        return snake;
    }
}
