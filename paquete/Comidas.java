package paquete;

public abstract class Comidas {
    String tipo = "";
    PowerUp powerup;
    Comidas(PowerUp _powerup){
        powerup = _powerup;
        tipo = _powerup.getTipo();
    }
    public void crear(){
    
    }
}
