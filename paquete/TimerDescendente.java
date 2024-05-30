package paquete;

/**
 * Esta clase representa un temporizador descendente.
 * Implementa la interfaz Timer.
 */
public class TimerDescendente implements Timer{
    final int tiempoFinal = 0;
    int tiempoOriginal = 180;
    String tiempo = "180";
    int tiempoInicial = 180;

    /**
     * Constructor por defecto de la clase TimerDescendente.
     */
    TimerDescendente(){}

    /**
     * Constructor de la clase TimerDescendente que permite establecer un tiempo inicial personalizado.
     * @param inicial el tiempo inicial del temporizador
     */
    TimerDescendente(int inicial){
        tiempoOriginal = inicial;
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
    public void setTiempoInicial(int inicial){
        tiempoInicial = inicial;
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
