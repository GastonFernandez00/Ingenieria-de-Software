package paquete;

import javax.swing.JOptionPane;

/**
 * Esta clase representa un temporizador descendente.
 * Implementa la interfaz Timer.
 */
public class TimerDescendente implements Timer{
    private final int tiempoFinal = 0;
    private int tiempoOriginal = 180;
    private String tiempo = "180";
    private int tiempoInicial = 180;

    /**
     * Constructor por defecto de la clase TimerDescendente.
     */
    public TimerDescendente(){}

    /**
     * Constructor de la clase TimerDescendente que permite establecer un tiempo inicial personalizado.
     * @param inicial el tiempo inicial del temporizador
     */
    public TimerDescendente(Object inicial){
        if(!(inicial instanceof Integer)){return;}
        tiempoOriginal = (int)inicial;
        setTiempoInicial(inicial);
    }
    
    /**
     * Obtiene el tiempo inicial del temporizador.
     * @return el tiempo inicial del temporizador como una cadena de caracteres
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
     * @param inicial el tiempo inicial del temporizador
     */
    public void setTiempoInicial(Object inicial){
        if(!(inicial instanceof Integer)){return;}
        if((int)inicial < 30 || (int)inicial > 600){
            JOptionPane.showMessageDialog(null, 
            "El valor minimo es [30] segundos\n"+
            "El valor maximo es [600] segundos", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        tiempoInicial = (int)inicial;
        tiempoOriginal = (int)inicial;
        setInicial(""+inicial);
        
    }

    /*
     * Establece el tiempo inicial del temporizador.
     */
    private void setInicial(String inicial){
        tiempo = inicial;
    }

    /**
     * Modifica el tiempo del temporizador.
     * Decrementa el tiempo en uno.
     */
    public void modificarTiempo(){
        tiempoInicial--;
        tiempo = Integer.toString(tiempoInicial);
    }

    /**
     * Obtiene el tiempo final del temporizador.
     * @return el tiempo final del temporizador como un entero
     */
    public int getTiempoFinal(){
        return tiempoFinal;
    }

    /**
     * Reinicia el temporizador, estableciendo el tiempo inicial al valor original.
     */
    public void reiniciarTimer(){
        tiempoInicial = tiempoOriginal;
        tiempo = Integer.toString(tiempoOriginal);
    }
}
