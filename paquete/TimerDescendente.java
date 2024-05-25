package paquete;

public class TimerDescendente implements Timer{
    final int tiempoFinal = 0;
    int tiempoOriginal = 180;
    String tiempo = "180";
    int tiempoInicial = 180;

    TimerDescendente(){}

    TimerDescendente(int inicial){
        tiempoOriginal = inicial;
        setTiempoInicial(inicial);
    }
    
    public String getInicial(){
        return tiempo;
    }
    public int getTiempoInicial(){
        return tiempoInicial;
    }

    public void setTiempoInicial(int inicial){
        tiempoInicial = inicial;
        setInicial(""+inicial);
    }

    private void setInicial(String inicial){
        tiempo = inicial;
    }

    public void modificarTiempo(){
        tiempoInicial--;
        tiempo = Integer.toString(tiempoInicial);
    }

    public int getTiempoFinal(){
        return tiempoFinal;
    }

    public void reiniciarTimer(){
        tiempoInicial = tiempoOriginal;
        tiempo = Integer.toString(tiempoOriginal);
    }
}
