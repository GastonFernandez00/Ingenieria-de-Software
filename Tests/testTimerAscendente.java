package Tests;
import paquete.Timer;
import paquete.TimerAscendente;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testTimerAscendente {
    
    @Test
    void testGetInicial(){
        TimerAscendente timer = new TimerAscendente();
        String expected = "0";
        String actual = timer.getInicial();
        assertEquals(expected, actual, "Se devolvio un valor diferente a '0'");

    }

    @Test
    void testGetTiempoInicial(){
        TimerAscendente timer = new TimerAscendente();
        int expected = 0;
        int actual = timer.getTiempoInicial();
        assertEquals(expected, actual, "Se devolvio un valor diferente a '0'");
    }

    @Test
    void testSetTiempoInicial(){ 
        TimerAscendente timer = new TimerAscendente();
        int expected = 0;
        timer.setTiempoInicial(5);
        int actual = timer.getTiempoInicial();
        assertEquals(expected, actual, "El tiempo inicial se modifico!");
    }

    @Test
    void testModificarTiempo(){
        TimerAscendente timer = new TimerAscendente();
        int expected = 1;
        timer.modificarTiempo();
        int actual = timer.getTiempoInicial();
        assertEquals(expected, actual, "El tiempo no se modifico correctamente");
    }

    @Test
    void testGetTiempoFinal(){
        TimerAscendente timer = new TimerAscendente();
        int expected = -1;
        int actual = timer.getTiempoFinal();
        assertEquals(expected, actual, "El tiempo final no es -1");
    }

    @Test
    void testReiniciarTimer(){
        TimerAscendente timer = new TimerAscendente();
        for(int i = 0; i < 10; i++) timer.modificarTiempo();
        timer.reiniciarTimer();
        int expected = 0;
        int actual = timer.getTiempoInicial();
        String actual_string = timer.getInicial();
        assertEquals(expected, actual, "El tiempo no se reinicio correctamente");
        assertEquals(Integer.toString(expected),actual_string, "El tiempo no se reinicio correctamente");
    }
}
