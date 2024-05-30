package Tests;
import paquete.Timer;
import paquete.TimerDescendente;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testTimerDescendente {

    @Test
    void testTimerDescendente_ConOffsetNormal(){
        Timer timer = new TimerDescendente(120);
        int expected = 120;
        int actual = timer.getTiempoInicial();
        String actual_string = timer.getInicial();
        assertEquals(expected, actual,"El tiempo inicial es diferente de "+expected);
        assertEquals(Integer.toString(expected), actual_string,"El tiempo inicial es diferente de "+expected);
    }

    @Test
    void testTimerDescendente_ConOffsetMinimo(){
        Timer timer = new TimerDescendente(0);
        int expected = 180;
        int actual = timer.getTiempoInicial();
        String actual_string = timer.getInicial();
        assertEquals(expected, actual,"El tiempo inicial es diferente de "+expected);
        assertEquals(Integer.toString(expected), actual_string,"El tiempo inicial es diferente de "+expected);
    }

    @Test
    void testTimerDescendente_ConOffsetMaximo(){
        Timer timer = new TimerDescendente(700);
        int expected = 180;
        int actual = timer.getTiempoInicial();
        String actual_string = timer.getInicial();
        assertEquals(expected, actual,"El tiempo inicial es diferente de "+expected);
        assertEquals(Integer.toString(expected), actual_string,"El tiempo inicial es diferente de "+expected);
    }

    @Test
    void testTimerDescendente_ConOffsetInvalido(){
        Timer timer = new TimerDescendente("hola");
        int expected = 180;
        int actual = timer.getTiempoInicial();
        String actual_string = timer.getInicial();
        assertEquals(expected, actual,"El tiempo inicial es diferente de "+expected);
        assertEquals(Integer.toString(expected), actual_string,"El tiempo inicial es diferente de "+expected);
    }

    @Test
    void testGetInicial() {
        Timer timer = new TimerDescendente();
        String expected = "180";
        String actual = timer.getInicial();
        assertEquals(expected, actual,"El tiempo inicial es diferente de "+expected);
    }

    @Test
    void testGetTiempoInicial() {
        Timer timer = new TimerDescendente();
        int expected = 180;
        int actual = timer.getTiempoInicial();
        assertEquals(expected, actual,"El tiempo inicial es diferente de "+expected);
    }

    @Test
    void testSetTiempoInicial_ValorNormal() {
        Timer timer = new TimerDescendente();
        timer.setTiempoInicial(120);
        int expected = 120;
        int actual = timer.getTiempoInicial();
        String actual_string = timer.getInicial();

        assertEquals(expected, actual,"El tiempo inicial es diferente de "+expected);
        assertEquals(Integer.toString(expected), actual_string,"El tiempo inicial es diferente de "+expected);
    }

    @Test
    void testSetTiempoInicial_ValorMinimo() {
        Timer timer = new TimerDescendente();
        timer.setTiempoInicial(0);
        int expected = 180;
        int actual = timer.getTiempoInicial();
        String actual_string = timer.getInicial();

        assertEquals(expected, actual,"El tiempo inicial es diferente de "+expected);
        assertEquals(Integer.toString(expected), actual_string,"El tiempo inicial es diferente de "+expected);
    }

    @Test
    void testSetTiempoInicial_ValorMaximo() {
        Timer timer = new TimerDescendente();
        timer.setTiempoInicial(700);
        int expected = 180;
        int actual = timer.getTiempoInicial();
        String actual_string = timer.getInicial();

        assertEquals(expected, actual,"El tiempo inicial es diferente de "+expected);
        assertEquals(Integer.toString(expected), actual_string,"El tiempo inicial es diferente de "+expected);
    }

    @Test
    void testSetTiempoInicial_ValorInvalido() {
        Timer timer = new TimerDescendente();
        timer.setTiempoInicial("hola");
        int expected = 180;
        int actual = timer.getTiempoInicial();
        String actual_string = timer.getInicial();

        assertEquals(expected, actual,"El tiempo inicial es diferente de "+expected);
        assertEquals(Integer.toString(expected), actual_string,"El tiempo inicial es diferente de "+expected);
    }

    @Test
    void testModificarTiempo(){
        Timer timer = new TimerDescendente(100);
        timer.modificarTiempo();
        int expected = 99;
        int actual = timer.getTiempoInicial();
        String actual_string = timer.getInicial();

        assertEquals(expected, actual,"El tiempo inicial es diferente de "+expected);
        assertEquals(Integer.toString(expected), actual_string,"El tiempo inicial es diferente de "+expected);
    }

    @Test
    void testGetTiempoFinal(){
        Timer timer = new TimerDescendente(100);
        int expected = 0;
        int actual = timer.getTiempoFinal();

        assertEquals(expected, actual,"El tiempo final es diferente de "+expected);
    }

    @Test
    void testReiniciarTimer(){
        Timer timer = new TimerDescendente(100);
        for(int i = 0; i < 10; i++) timer.modificarTiempo();
        timer.reiniciarTimer();
        int expected = 100;
        int actual = timer.getTiempoInicial();
        String actual_string = timer.getInicial();

        assertEquals(expected, actual,"El tiempo inicial es diferente de "+expected);
        assertEquals(Integer.toString(expected), actual_string,"El tiempo inicial es diferente de "+expected);
    }
}
