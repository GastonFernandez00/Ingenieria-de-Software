package com.snake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class ContrarrelojTest {

    private Contrarreloj contrarreloj;

    @BeforeEach
    void setUp() {
        JPanel panel = new JPanel();
        contrarreloj = new Contrarreloj(panel);
    }

    // Comprueba que el modo de juego es Contrarreloj
    @Test
    void getTipo() {
    String expected = "Contrarreloj";
    String actual = contrarreloj.getTipo();
    assertEquals(expected, actual, "El tipo de modo no es 'Contrarreloj'");
}
}