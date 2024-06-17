package com.snake;

import java.awt.Color;

public abstract class Comidas {
    private String tipo = "";
    private PowerUp powerup;

    // Constructor
    Comidas(PowerUp _powerup){
        powerup = _powerup;
        tipo = _powerup.getTipo();
    }

    // Devuelve el multiplicador
    public int getMultiplicador(){
        return powerup.getMultiplicarPuntaje();
    }

    // Devuelve el tipo de comida
    public String getTipo(){
        return tipo;
    }

    // Devuelve el color de la comida
    public Color getColor(){
        return powerup.getColor();
    }

}
