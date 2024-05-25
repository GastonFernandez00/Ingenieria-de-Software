package paquete;

public interface Timer {

    public String getInicial();

    public int getTiempoInicial();

    public void setTiempoInicial(int inicial);

    public void modificarTiempo();

    public void reiniciarTimer();

    public int getTiempoFinal();
}
