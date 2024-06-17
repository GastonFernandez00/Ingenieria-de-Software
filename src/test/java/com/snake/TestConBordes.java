package com.snake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JPanel;


public class TestConBordes {
    private JPanel panelPrincipal;
    private PanelSnake snake;
    private ConBordes conBordes;

    @BeforeEach
    void setUp() {
        panelPrincipal = new JPanel();
        snake = new PanelSnake(506,23);
        conBordes = new ConBordes(panelPrincipal, snake);
    }

    //Comprueba que el panel principal no sea nulo
    @Test
    void testGetPanelPrincipal() {
        assertEquals(panelPrincipal, conBordes.getPanelPrincipal());
    }

    //Comprueba que el panel snake no sea nulo
    @Test
    void testGetSnake() {
        assertEquals(snake, conBordes.getSnake());
    }

    //Comprueba que el tipo sea "Con Bordes"
    @Test
    void testGetTipo() {
        assertEquals("Con Bordes", conBordes.getTipo());
    }

}


