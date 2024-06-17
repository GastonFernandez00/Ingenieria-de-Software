package com.snake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CNegraTest {

    private CNegra cNegra;

    @BeforeEach
    void setUp() {
        cNegra = new CNegra();
    }

    //Comprueba que el tipo de la casilla negra es "Normal"
    @Test
    void getTipo() {
        assertEquals("Normal", cNegra.getTipo());
    }
}