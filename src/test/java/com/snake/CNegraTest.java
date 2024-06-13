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

    @Test
    void getTipo() {
        assertEquals("Normal", cNegra.getTipo());
    }
}