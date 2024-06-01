package com.snake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicadorTest {

    private Multiplicador multiplicador;

    @BeforeEach
    void setUp() {
        multiplicador = Mockito.mock(Multiplicador.class);
    }

    @Test
    void getTipo() {
        Mockito.when(multiplicador.getTipo()).thenReturn("Multiplicador");

        String expected = "Multiplicador";
        String actual = multiplicador.getTipo();
        assertEquals(expected, actual, "El tipo de PowerUp no es 'Multiplicador'");
    }

    @Test
    void getColor() {
        Color expectedColor = new Color(150, 0, 0);
        Mockito.when(multiplicador.getColor()).thenReturn(expectedColor);

        Color actualColor = multiplicador.getColor();
        assertEquals(expectedColor, actualColor, "El color del PowerUp no es el esperado");

    }

    @Test
    void testGetAumentoVelocidad() {
        int expectedSpeedIncrease = 10;
        Mockito.when(multiplicador.getAumentoVelocidad()).thenReturn(expectedSpeedIncrease);

        int actualSpeedIncrease = multiplicador.getAumentoVelocidad();
        assertEquals(expectedSpeedIncrease, actualSpeedIncrease, "El aumento de velocidad no es el esperado");
    }

    @Test
    void testGetMultiplicarPuntaje() {
        int expectedScoreMultiplier = 4;
        Mockito.when(multiplicador.getMultiplicarPuntaje()).thenReturn(expectedScoreMultiplier);

        int actualScoreMultiplier = multiplicador.getMultiplicarPuntaje();
        assertEquals(expectedScoreMultiplier, actualScoreMultiplier, "El multiplicador de puntaje no es el esperado");
    }

    @Test
    void testGetModificarTiempo() {
       int expectedTimeModifier = 0;
        Mockito.when(multiplicador.getmodificarTiempo()).thenReturn(expectedTimeModifier);

        int actualTimeModifier = multiplicador.getmodificarTiempo();
        assertEquals(expectedTimeModifier, actualTimeModifier, "La modificación de tiempo no es la esperada");
    }
}