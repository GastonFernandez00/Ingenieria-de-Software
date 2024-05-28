package paquete;

import java.awt.Color;

public class Multiplicador implements PowerUp{
    int aumentoVelocidad = 10;
    int multiplicarPuntaje = 4;
    int modificarTiempo = 0;
    Color color = new Color(150, 0, 0);

    Multiplicador(){

    }

    public String getTipo(){
        return "Multiplicador";
    }

    public void crear(){
        
    }

    public Color getColor(){
        return color;
    }

    public int getAumentoVelocidad(){
        return aumentoVelocidad;
    }

    public int getMultiplicarPuntaje(){
        return multiplicarPuntaje;
    }

    public int getmodificarTiempo(){
        return modificarTiempo;
    }
}
