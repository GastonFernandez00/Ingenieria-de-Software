
package com.snake;

import org.junit.jupiter.api.Test;
import com.snake.HiloAvanzar;
import com.snake.PanelSnake;

//import paquete.HiloAvanzar;
import static org.junit.jupiter.api.Assertions.*;
class TestHiloAvanzar {

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

        
    }
    /* Nota: No se puede realizar un test para el método run(), ya que por la naturaleza 
    de su ejecucion es muy complicado, pero se haran test de la clase PanaelSnake */
}