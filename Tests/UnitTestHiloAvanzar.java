package Tests;
import org.junit.jupiter.api.Test;

import paquete.HiloAvanzar;
import paquete.PanelSnake;

//import paquete.HiloAvanzar;
import static org.junit.jupiter.api.Assertions.*;
class HiloAvanzarTest {

    @Test
    void testParar() {
        // Crea una instancia de PanelSnake con los argumentos requeridos
        PanelSnake panel = new PanelSnake(559, 606);

        // Crea una instancia de HiloAvanzar con el PanelSnake
        final HiloAvanzar hilo = new HiloAvanzar(panel);

        // Llama al método Parar()
        hilo.Parar();
        // Verifica que el estado es false
        assertFalse(hilo.estado);

        //La parte del run es re dificil de probar, ver como hacerlo(con mock)
    }
}