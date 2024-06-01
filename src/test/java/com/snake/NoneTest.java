package com.snake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class NoneTest {

    private None none;

    @BeforeEach
    void setUp() {
        none = Mockito.mock(None.class);
    }

    @Test
    void getTipo() {
        Mockito.when(none.getTipo()).thenReturn("Normal");

        String expected = "Normal";
        String actual = none.getTipo();
        assertEquals(expected, actual, "El tipo de PowerUp no es 'Normal'");
    }

    @Test
    void getColor() {
        Color expectedColor = new Color(0, 1, 0);
        Mockito.when(none.getColor()).thenReturn(expectedColor);

        Color actualColor = none.getColor();
        assertEquals(expectedColor, actualColor, "El color del PowerUp no es el esperado");
    }

    @Test
    void GetAumentoVelocidad() {
        int expectedSpeedIncrease = 0;
        Mockito.when(none.getAumentoVelocidad()).thenReturn(expectedSpeedIncrease);

        int actualSpeedIncrease = none.getAumentoVelocidad();
        assertEquals(expectedSpeedIncrease, actualSpeedIncrease, "El aumento de velocidad no es el esperado");
    }

    @Test
    void GetMultiplicarPuntaje() {
        int expectedScoreMultiplier = 1;
        Mockito.when(none.getMultiplicarPuntaje()).thenReturn(expectedScoreMultiplier);

        int actualScoreMultiplier = none.getMultiplicarPuntaje();
        assertEquals(expectedScoreMultiplier, actualScoreMultiplier, "El multiplicador de puntaje no es el esperado");
    }

    @Test
    void GetModificarTiempo() {
        int expectedTimeModifier = 0;
        Mockito.when(none.getmodificarTiempo()).thenReturn(expectedTimeModifier);

        int actualTimeModifier = none.getmodificarTiempo();
        assertEquals(expectedTimeModifier, actualTimeModifier, "La modificación de tiempo no es la esperada");
    }
}