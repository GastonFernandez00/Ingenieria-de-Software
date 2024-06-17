package com.snake;

import java.awt.Color;

/**
 * PowerUp
 */
public interface PowerUp {

    // Retorna el tipo de PowerUp como un String
    public String getTipo();

    // Retorna el valor de aumento de puntaje. El valor podría ser negativo.
    public int getMultiplicarPuntaje();

    // Retorna el valor de aumento de tiempo. El valor podría ser negativo.
    public int getmodificarTiempo();

    // Retorna el Color de la fruta
    public Color getColor();

    
    
}