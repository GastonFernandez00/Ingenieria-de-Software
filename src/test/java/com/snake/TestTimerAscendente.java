package com.snake;
import com.snake.Timer;
import com.snake.TimerAscendente;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTimerAscendente {
    
    @Test
    void testGetInicial(){
        Timer timer = new TimerAscendente();
        String expected = "0";
        String actual = timer.getInicial();
        assertEquals(expected, actual, "Se devolvio un valor diferente a '0'");

    }

    @Test
    void testGetTiempoInicial(){
        Timer timer = new TimerAscendente();
        int expected = 0;
        int actual = timer.getTiempoInicial();
        assertEquals(expected, actual, "Se devolvio un valor diferente a '0'");
    }

    @Test
    void testSetTiempoInicial(){ 
        Timer timer = new TimerAscendente();
        int expected = 0;
        timer.setTiempoInicial(5);
        int actual = timer.getTiempoInicial();
        assertEquals(expected, actual, "El tiempo inicial se modifico!");
    }

    @Test
    void testModificarTiempo(){
        Timer timer = new TimerAscendente();
        int expected = 1;
        timer.modificarTiempo();
        int actual = timer.getTiempoInicial();
        assertEquals(expected, actual, "El tiempo no se modifico correctamente");
    }

    @Test
    void testGetTiempoFinal(){
        Timer timer = new TimerAscendente();
        int expected = -1;
        int actual = timer.getTiempoFinal();
        assertEquals(expected, actual, "El tiempo final no es -1");
    }

    @Test
    void testReiniciarTimer(){
        Timer timer = new TimerAscendente();
        for(int i = 0; i < 10; i++) timer.modificarTiempo();
        timer.reiniciarTimer();
        int expected = 0;
        int actual = timer.getTiempoInicial();
        String actual_string = timer.getInicial();
        assertEquals(expected, actual, "El tiempo no se reinicio correctamente");
        assertEquals(Integer.toString(expected),actual_string, "El tiempo no se reinicio correctamente");
    }
}
