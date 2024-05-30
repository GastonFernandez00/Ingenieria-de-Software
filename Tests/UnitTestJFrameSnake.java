package Tests;
import org.junit.jupiter.api.Test;

import paquete.JFrameSnake;

//import paquete.HiloAvanzar;
import static org.junit.jupiter.api.Assertions.*;

class UnitTestJFrameSnake {

    @Test
    void testInitialization() {
        // Crea una instancia de JFrameSnake
        JFrameSnake frame = new JFrameSnake();

        //Verifica que los componentes se han agregado correctamente
        assertNotNull(frame.getMenu());
    }

    //creo que aca hay cosas que no podemos testear 
}