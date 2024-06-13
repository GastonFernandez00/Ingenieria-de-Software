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

    @Test
    void getTipo() {
        String expected = "Multiplicador";
        String actual = multiplicador.getTipo();
        assertEquals(expected, actual, "El tipo de PowerUp no es 'Multiplicador'");
    }

    @Test
    void getColor() {
        Color expectedColor = new Color(150, 0, 0);
        Color actualColor = multiplicador.getColor();
        assertEquals(expectedColor, actualColor, "El color del PowerUp no es el esperado");
    }

    @Test
    void GetAumentoVelocidad() {
        int expectedSpeedIncrease = 10;
        int actualSpeedIncrease = multiplicador.getAumentoVelocidad();
        assertEquals(expectedSpeedIncrease, actualSpeedIncrease, "El aumento de velocidad no es el esperado");
    }

    @Test
    void GetMultiplicarPuntaje() {
        int expectedScoreMultiplier = 4;
        int actualScoreMultiplier = multiplicador.getMultiplicarPuntaje();
        assertEquals(expectedScoreMultiplier, actualScoreMultiplier, "El multiplicador de puntaje no es el esperado");
    }

    @Test
    void GetModificarTiempo() {
        int expectedTimeModifier = 0;
        int actualTimeModifier = multiplicador.getmodificarTiempo();
        assertEquals(expectedTimeModifier, actualTimeModifier, "La modificación de tiempo no es la esperada");
    }
}