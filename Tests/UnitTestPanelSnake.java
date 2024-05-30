package Tests;
import org.junit.jupiter.api.Test;

import paquete.PanelSnake;

//import paquete.HiloAvanzar;
import static org.junit.jupiter.api.Assertions.*;
class PanelSnakeTest {

    @Test
    void testConstructor() {
        // Crea una instancia de PanelSnake
        PanelSnake panel = new PanelSnake(100, 10);

        // Verifica que los valores se han inicializado correctamente
        assertEquals(100, panel.getTam());
        assertEquals(10, panel.getCant()); 
        assertEquals(10, panel.getTamC());
        assertNotNull(panel.geth1());
        assertNotNull(panel.gethilo());
    }
    
    //igual que las demas
}