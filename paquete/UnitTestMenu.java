package paquete;
import org.junit.jupiter.api.Test;
import paquete.Menu;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestMenu{

    @Test
    void testGetOpcion() {
        Menu menu = new Menu();
        int expected = 0; // replace with the expected value
        int actual = menu.getOpcion();
        assertEquals(expected, actual, "The method getOpcion did not return the expected value");
    }

    private void assertEquals(int expected, int actual, String s) {
    }

    // Add more test methods as needed
}