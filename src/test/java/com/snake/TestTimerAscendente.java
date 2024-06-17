package com.snake;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTimerAscendente {
    
    //Comprueba que el tiempo con el que se inicia sea igual al tiempo inicial
    @Test
    void testGetInicial(){
        Timer timer = new TimerAscendente();
        String expected = "0";
        String actual = timer.getInicial();
        assertEquals(expected, actual, "Se devolvio un valor diferente a '0'");

    }

    //Comprueba que el tiempo inicial sea 0
    @Test
    void testGetTiempoInicial(){
        Timer timer = new TimerAscendente();
        int expected = 0;
        int actual = timer.getTiempoInicial();
        assertEquals(expected, actual, "Se devolvio un valor diferente a '0'");
    }

    //Comprueba que el tiempo no se haya modificado
    @Test
    void testSetTiempoInicial(){ 
        Timer timer = new TimerAscendente();
        int expected = 0;
        timer.setTiempoInicial(5);
        int actual = timer.getTiempoInicial();
        assertEquals(expected, actual, "El tiempo inicial se modifico!");
    }

    //Comprueba que el tiempo se haya modificado
    @Test
    void testModificarTiempo(){
        Timer timer = new TimerAscendente();
        int expected = 1;
        timer.modificarTiempo();
        int actual = timer.getTiempoInicial();
        assertEquals(expected, actual, "El tiempo no se modifico correctamente");
    }

    //Comprueba que el tiempo final sea -1
    @Test
    void testGetTiempoFinal(){
        Timer timer = new TimerAscendente();
        int expected = -1;
        int actual = timer.getTiempoFinal();
        assertEquals(expected, actual, "El tiempo final no es -1");
    }

    //Comprueba que el tiempo se reinicie correctamente
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
