package com.snake;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import javax.swing.JPanel;


public class TestConBordes {
    private JPanel panelPrincipal;
    private PanelSnake snake;
    private ConBordes conBordes;

    @BeforeEach
    void setUp() {
        panelPrincipal = mock(JPanel.class);
        snake = mock(PanelSnake.class);
        conBordes = new ConBordes(panelPrincipal, snake);
    }

    @Test
    void testGetPanelPrincipal() {
        assertEquals(panelPrincipal, conBordes.getPanelPrincipal());
    }

    @Test
    void testGetSnake() {
        assertEquals(snake, conBordes.getSnake());
    }

    @Test
    void testGetTipo() {
        assertEquals("Con Bordes", conBordes.getTipo());
    }

}


