
// package com.snake;

// import org.junit.jupiter.api.Test;
// import com.snake.JFrameSnake;
// import com.snake.PanelSnake;

// import static org.junit.jupiter.api.Assertions.*;

// class TestJFrameSnake {

//     @Test
//     void testInitialization() {
//         // Crea una instancia de JFrameSnake
//         JFrameSnake frame = new JFrameSnake();

//         // Verifica que los componentes se han inicializado correctamente
//         assertNotNull(frame.getcontentPane());
//         assertNotNull(frame.snake);
//         assertNotNull(frame.getlblNewLabel()); 
//         assertNotNull(frame.lblPuntaje);  

//     }

//     //Para hacer test que manejan eventos de teclado, es difil por la interaccion con el usuario.
//     //No podemos usar mock porque en este caso no tenemos independecias inyectables entonces no hay mucho que se puedasimular.
// }