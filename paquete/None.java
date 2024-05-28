package paquete;

public class None implements PowerUp {
    
    int aumentoVelocidad = 0;
    int multiplicarPuntaje = 1;
    int modificarTiempo = 0;

    public String getTipo(){
        return "Normal";
    }

    public void crear(){
        
    }

    public int getAumentoVelocidad(){
        return aumentoVelocidad;
    }

    public int getMultiplicarPuntaje(){
        return multiplicarPuntaje;
    }

    public int getmodificarTiempo(){
        return modificarTiempo;
    }
}
