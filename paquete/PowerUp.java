package paquete;

import java.awt.Color;

/**
 * PowerUp
 */
public interface PowerUp {

    public void crear();

    public String getTipo();

    public int getAumentoVelocidad();

    public int getMultiplicarPuntaje();

    public int getmodificarTiempo();

    public Color getColor();

    
    
}