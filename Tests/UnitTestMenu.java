package Tests;
import org.junit.jupiter.api.Test;

import paquete.Menu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class UnitTestMenu{

    @Test
    void testGetOpcion() {
        Menu menu = new Menu();
        int[] expected = {0, 1, 2}; // replace with the expected value
        int actual = menu.getOpcion(); // change the type of actual to int[]
        Assertions.assertEquals(expected, actual, "The method getOpcion did not return the expected value");
    }

    private void assertEquals(int[] expected, int[] actual, String s) {
        for(int i = 0; i < expected.length; i++){
            assertEquals(expected[i], actual[i], s);
        }
    }

    private void assertEquals(int expected, int actual, String s) {
        assertEquals(expected, actual, s);
    }

    // Add more test methods as needed
}