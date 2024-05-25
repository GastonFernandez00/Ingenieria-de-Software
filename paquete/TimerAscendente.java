package paquete;

public class TimerAscendente implements Timer {
    final int tiempoFinal = -1;
    int tiempoInicial = 0;
    String tiempo = "0";

    TimerAscendente(){}

    public String getInicial(){
        return tiempo;
    }
    
    public int getTiempoInicial(){
        return tiempoInicial;
    }

    public void setTiempoInicial(int inicial){}

    public void modificarTiempo(){
        tiempoInicial++;
        tiempo = Integer.toString(tiempoInicial);
    }

    public int getTiempoFinal(){
        return tiempoFinal;
    }

    public void reiniciarTimer(){
        tiempoInicial = 0;
        tiempo = "0";
    }

}