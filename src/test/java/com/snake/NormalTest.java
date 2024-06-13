package com.snake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class NormalTest {

    private Normal normal;

    @BeforeEach
    void setUp() {
        JPanel panel = new JPanel();
        normal = new Normal(panel);
    }

    @Test
    void getTipo() {
        String expected = "Normal";
        String actual = normal.getTipo();
        assertEquals(expected, actual, "El tipo de modo no es 'Normal'");
    }
}