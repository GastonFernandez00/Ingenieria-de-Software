package com.snake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicadorTest {

    private Multiplicador multiplicador;

    @BeforeEach
    void setUp() {
        multiplicador = new Multiplicador();
    }

    //Comprueba que el tipo de PowerUp sea "Multiplicador"
    @Test
    void getTipo() {
        String expected = "Multiplicador";
        String actual = multiplicador.getTipo();
        assertEquals(expected, actual, "El tipo de PowerUp no es 'Multiplicador'");
    }

    //Comprueba que el color de multiplicador sea rojo
    @Test
    void getColor() {
        Color expectedColor = new Color(150, 0, 0);
        Color actualColor = multiplicador.getColor();
        assertEquals(expectedColor, actualColor, "El color del PowerUp no es el esperado");
    }

    //Comprueba que el multiplicador de puntaje sea 4
    @Test
    void GetMultiplicarPuntaje() {
        int expectedScoreMultiplier = 4;
        int actualScoreMultiplier = multiplicador.getMultiplicarPuntaje();
        assertEquals(expectedScoreMultiplier, actualScoreMultiplier, "El multiplicador de puntaje no es el esperado");
    }

    //Comprueba que el multiplicador de tiempo sea 0
    @Test
    void GetModificarTiempo() {
        int expectedTimeModifier = 0;
        int actualTimeModifier = multiplicador.getmodificarTiempo();
        assertEquals(expectedTimeModifier, actualTimeModifier, "La modificación de tiempo no es la esperada");
    }
}