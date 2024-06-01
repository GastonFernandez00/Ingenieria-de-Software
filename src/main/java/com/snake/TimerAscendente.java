package com.snake;

/**
 * Esta clase representa un temporizador ascendente que implementa la interfaz Timer.
 * El temporizador cuenta desde cero hasta un tiempo final predefinido.
 */
public class TimerAscendente implements Timer {
    private final int tiempoFinal = -1;
    private int tiempoInicial = 0;
    private String tiempo = "0";

    /**
     * Crea una instancia de TimerAscendente.
     */
    public TimerAscendente(){}

    /**
     * Obtiene el tiempo inicial del temporizador.
     * @return el tiempo inicial del temporizador
     */
    public String getInicial(){
        return tiempo;
    }
    
    /**
     * Obtiene el tiempo inicial del temporizador.
     * @return el tiempo inicial del temporizador como un entero
     */
    public int getTiempoInicial(){
        return tiempoInicial;
    }

    /**
     * Establece el tiempo inicial del temporizador.
     * @param inicial el tiempo inicial a establecer
     */
    public void setTiempoInicial(Object inicial){}

    /**
     * Modifica el tiempo del temporizador incrementándolo en uno.
     */
    public void modificarTiempo(){
        tiempoInicial++;
        tiempo = Integer.toString(tiempoInicial);
    }

    /**
     * Obtiene el tiempo final del temporizador.
     * @return el tiempo final del temporizador
     */
    public int getTiempoFinal(){
        return tiempoFinal;
    }

    /**
     * Reinicia el temporizador estableciendo el tiempo inicial a cero.
     */
    public void reiniciarTimer(){
        tiempoInicial = 0;
        tiempo = "0";
    }

}