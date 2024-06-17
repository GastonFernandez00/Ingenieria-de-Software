package com.snake;

import javax.swing.JPanel;
import javax.swing.plaf.PanelUI;

public class ConBordes extends Modos{
    JPanel panelPrincipal;
    PanelSnake snake;

    // Constructor
    public ConBordes(JPanel panelPrincipal, PanelSnake snake){
        super(panelPrincipal, new TimerAscendente());
        this.panelPrincipal = panelPrincipal;
        this.snake = snake;
        snake.setBarreras();
    }

    @Override
    // Devuelve el tipo de modo de juego
    public String getTipo() {
        return "Con Bordes";
    }
    
    // Devuelve el panel principal
    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    // Devuelve la serpiente
    public PanelSnake getSnake() {
        return snake;
    }
}
