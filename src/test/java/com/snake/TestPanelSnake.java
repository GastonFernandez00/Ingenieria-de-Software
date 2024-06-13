// package com.snake;

// import org.junit.jupiter.api.Test;
// import org.mockito.Mockito;
// import com.snake.PanelSnake;


// //import paquete.HiloAvanzar;
// import static org.junit.jupiter.api.Assertions.*;
// import java.awt.Graphics;
// class TestPanelSnake {

//     @Test
//     void testConstructor() {
//         // Crea una instancia de PanelSnake
//         PanelSnake panel = new PanelSnake(100, 10);

//         // Verifica que los valores se han inicializado correctamente
//         assertEquals(100, (int) panel.getTam(),"Los valores no son iguales");
//         assertEquals(10, (int) panel.getTamC(),"Los valores no son iguales");
//         assertNotNull(panel.geth1());
//         assertNotNull(panel.gethilo());
//     }
    
//     @Test
//     void testGenerarComida() {
//         // Crea una instancia de PanelSnake
//         PanelSnake panel = new PanelSnake(100, 10);

//         // Llena la serpiente con algunas coordenadas
//         panel.snake.add(new int[]{5, 5});
//         panel.snake.add(new int[]{6, 6});

//         // Genera comida varias veces
//         for (int i = 0; i < 100; i++) {
//             panel.generarComida();

//             // Verifica que la comida no se genera en las mismas coordenadas que la serpiente
//             for (int[] par : panel.snake) {
//                 assertFalse(par[0] == panel.comida[0] && par[1] == panel.comida[1]);
              
//             }
//         }
//     }
//     @Test
//     void testPintarComida() {
//         // Crea una instancia de PanelSnake
//         PanelSnake panel = new PanelSnake(100, 10);

//         // Crea un objeto Graphics simulado
        
//         Graphics dibujo = Mockito.mock(Graphics.class);
//         // Llama al método pintarComida
//         panel.pintarComida(dibujo);

//         // Verifica que se llamó al método fillRect del objeto Graphics
//         Mockito.verify(dibujo, Mockito.times(4)).fillRect(Mockito.anyInt(), Mockito.anyInt(), Mockito.anyInt(), Mockito.anyInt());
//     }
// }
