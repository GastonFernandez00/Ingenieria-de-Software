package com.snake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class NoneTest {

    private None none;

    @BeforeEach
    void setUp() {
        none = new None();
    }

    //Comprueba que el tipo de PowerUp sea "Normal"
    @Test
    void getTipo() {
        String expected = "Normal";
        String actual = none.getTipo();
        assertEquals(expected, actual, "El tipo de PowerUp no es 'Normal'");
    }

    //Comprueba que el color de None sea verde
    @Test
    void getColor() {
        Color expectedColor = new Color(0, 1, 0);
        Color actualColor = none.getColor();
        assertEquals(expectedColor, actualColor, "El color del PowerUp no es el esperado");
    }

    //Comprueba que el multiplicador de puntaje de None sea 1
    @Test
    void GetMultiplicarPuntaje() {
        int expectedScoreMultiplier = 1;
        int actualScoreMultiplier = none.getMultiplicarPuntaje();
        assertEquals(expectedScoreMultiplier, actualScoreMultiplier, "El multiplicador de puntaje no es el esperado");
    }

    //Comprueba que el multiplicador de tiempo de None sea 0
    @Test
    void GetModificarTiempo() {
        int expectedTimeModifier = 0;
        int actualTimeModifier = none.getmodificarTiempo();
        assertEquals(expectedTimeModifier, actualTimeModifier, "La modificación de tiempo no es la esperada");
    }
}