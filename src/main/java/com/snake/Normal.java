package com.snake;

import javax.swing.JPanel;

/**
 * La clase Normal es una subclase de Modos que representa el modo normal del programa.
 * Extiende la funcionalidad de la clase padre agregando un panel principal y un temporizador ascendente.
 */
public class Normal extends Modos {
    /**
     * Crea una instancia de la clase Normal.
     * @param panelPrincipal el panel principal del programa.
     */
    public Normal(JPanel panelPrincipal){
        super(panelPrincipal,new TimerAscendente());
    }

    /**
     * Retorna el tipo de modo.
     * @return el tipo de modo.
     */
    public String getTipo(){
        return "Normal";
    }
}
