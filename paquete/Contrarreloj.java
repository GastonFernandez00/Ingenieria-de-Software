package paquete;
import javax.swing.JPanel;

/**
 * La clase Contrarreloj es una subclase de Modos que representa el modo de juego Contrarreloj.
 * En este modo, el jugador debe conseguir el mayor puntaje en un tiempo determinado.
 */
public class Contrarreloj extends Modos {

    /**
     * Crea una instancia de Contrarreloj con un panel principal y un temporizador descendente.
     * @param panelPrincipal el panel principal del juego
     */
    public Contrarreloj(JPanel panelPrincipal){
        super(panelPrincipal,new TimerDescendente());
    }
    
    /**
     * Crea una instancia de Contrarreloj con un panel principal y un temporizador 
     * descendente con un tiempo inicial especificado.
     * @param panelPrincipal el panel principal del juego
     * @param TiempoInicial el tiempo inicial del temporizador descendente
     */
    public Contrarreloj(JPanel panelPrincipal,int TiempoInicial){
        super(panelPrincipal,new TimerDescendente(TiempoInicial));
    }

    public String getTipo(){
        return "Contrarreloj";
    }

}
