package com.snake;

import java.awt.Color;

public class Multiplicador implements PowerUp{
    int multiplicarPuntaje = 4;
    int modificarTiempo = 0;
    Color color = new Color(150, 0, 0);

    Multiplicador(){}

    public String getTipo(){
        return "Multiplicador";
    }

    public Color getColor(){
        return color;
    }

    public int getMultiplicarPuntaje(){
        return multiplicarPuntaje;
    }

    public int getmodificarTiempo(){
        return modificarTiempo;
    }
}
