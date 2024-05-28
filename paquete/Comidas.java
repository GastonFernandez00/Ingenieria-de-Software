package paquete;

import java.awt.Color;

public abstract class Comidas {
    private String tipo = "";
    private PowerUp powerup;
    Comidas(PowerUp _powerup){
        powerup = _powerup;
        tipo = _powerup.getTipo();
    }
    public void crear(){
    
    }

    public int getMultiplicador(){
        return powerup.getMultiplicarPuntaje();
    }

    public String getTipo(){
        return tipo;
    }

    public Color getColor(){
        return powerup.getColor();
    }

}
