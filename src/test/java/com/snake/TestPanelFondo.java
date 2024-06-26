package com.snake;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

public class TestPanelFondo {

    //Comprobamos que el panel se inicializa sin barreras
    @Test
    void Inicializar_el_Panel_Sin_Barreras(){
        PanelFondo panel = new PanelFondo(30,10);
        assertFalse(panel.barreras);
    }

    //Comprobamos que se establecen las barreras
    @Test
    void Establecer_Barreras(){
        PanelFondo panel = new PanelFondo(30,10);
        panel.setBarreras();
        assert(panel.barreras);
    }

    /* El resto de funciones son gráficas ó son privadas */
    
}
