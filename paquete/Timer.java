package paquete;

/**
 * La interfaz Timer define los métodos necesarios para un temporizador.
 */
public interface Timer {

    /**
     * Obtiene el valor inicial del temporizador.
     * 
     * @return el valor inicial del temporizador como una cadena de caracteres.
     */
    public String getInicial();

    /**
     * Obtiene el tiempo inicial del temporizador.
     * 
     * @return el tiempo inicial del temporizador como un entero.
     */
    public int getTiempoInicial();

    /**
     * Establece el tiempo inicial del temporizador.
     * 
     * @param inicial el tiempo inicial del temporizador como un entero.
     */
    public void setTiempoInicial(Object inicial);

    /**
     * Modifica el tiempo del temporizador.
     */
    public void modificarTiempo();

    /**
     * Reinicia el temporizador.
     */
    public void reiniciarTimer();

    /**
     * Obtiene el tiempo final del temporizador.
     * 
     * @return el tiempo final del temporizador como un entero.
     */
    public int getTiempoFinal();
}
