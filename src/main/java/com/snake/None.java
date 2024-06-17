package com.snake;

import java.awt.Color;

public class None implements PowerUp {
    int multiplicarPuntaje = 1;
    int modificarTiempo = 0;
    Color color = new Color(0, 1, 0);

    // Constructor
    None(){}

    // Devuelve el tipo de PowerUp
    public String getTipo(){
        return "Normal";
    }

    // Devuelve el color aplicable a la comida
    public Color getColor(){
        return color;
    }

    // Devuelve el multiplicador de puntaje
    public int getMultiplicarPuntaje(){
        return multiplicarPuntaje;
    }

    // Devuelve el modificador de tiempo
    public int getmodificarTiempo(){
        return modificarTiempo;
    }
}
