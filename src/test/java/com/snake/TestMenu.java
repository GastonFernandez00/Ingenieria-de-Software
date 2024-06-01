package com.snake;
import com.snake.Menu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class TestMenu{

    @Test
    void testGetOpcion() {
        Menu menu = new Menu();
        int[] expected = {0, 1, 2}; // replace with the expected value
        int actual = menu.getOpcion();
        assertEquals(expected, actual,
        "Se devolvió un valor diferente al esperado en getOpcion"+actual);
    }

    private void assertEquals(int[] expected, int actual, String s) {
        boolean found = false;
        for(int i = 0; i < expected.length; i++){
            if(expected[i] == actual){
                found = true;
                break;
            }
        }
        assertTrue(found, s);
    }
}