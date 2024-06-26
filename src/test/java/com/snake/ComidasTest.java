package com.snake;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.Color;

import static org.junit.jupiter.api.Assertions.*;

class ComidasTest {

    private Comidas comidas;
    private PowerUp powerup;

    @BeforeEach
    void setUp() {
        powerup = Mockito.mock(PowerUp.class);
        comidas = new Comidas(powerup) {}; // Comidas es abstracta, creamos una instancia anónima
    }

    //Comparar si multiplicador de puntaje es igual al que se espera
    @Test
    void getMultiplicador() {
        Mockito.when(powerup.getMultiplicarPuntaje()).thenReturn(2);
        assertEquals(2, comidas.getMultiplicador());
    }
    
    //Comparar si el tipo de comida es igual al que se espera
    @Test
    void getTipo() {
        Mockito.when(powerup.getTipo()).thenReturn("tipoTest");
        comidas = new Comidas(powerup) {};
        assertEquals("tipoTest", comidas.getTipo());
    }

    //Comparar si el color de la comida es igual al que se espera
    @Test
    void getColor() {
        Color color = new Color(255, 0, 0);
        Mockito.when(powerup.getColor()).thenReturn(color);
        assertEquals(color, comidas.getColor());
    }
}