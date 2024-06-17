package com.snake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CRojaTest {

    private CRoja cRoja;

    @BeforeEach
    void setUp() {
        cRoja = new CRoja();
    }

    //Comprueba que cRoja es del tipo correcto
    @Test
    void getTipo() {
        assertEquals("Multiplicador", cRoja.getTipo());
    }
}