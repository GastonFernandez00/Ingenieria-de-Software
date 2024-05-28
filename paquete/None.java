package paquete;

import java.awt.Color;

public class None implements PowerUp {
    
    int aumentoVelocidad = 0;
    int multiplicarPuntaje = 1;
    int modificarTiempo = 0;
    Color color = new Color(0, 1, 0);

    public String getTipo(){
        return "Normal";
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
