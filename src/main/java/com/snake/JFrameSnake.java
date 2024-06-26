package com.snake;


import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JFrameSnake extends JFrame implements KeyListener {

	private JPanel contentPane;
	public PanelSnake snake;
	private JLabel lblNewLabel;
	public static JLabel lblPuntaje;
	private Menu menu;
	private int bordeLat;
	private int bordeSup;
	private PanelFondo fondo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameSnake frame = new JFrameSnake();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameSnake() {
		Modos modo;
		menu = new Menu();
		int opcion = menu.getOpcion(); //Guardo la opcion que me da en una variable

		setupFrame();
		setupContentPane();

		JPanel panelPrincipal = setupPanelPrincipal();
		setupSnakePanel(panelPrincipal);
		bordeSup = ( panelPrincipal.getHeight() - snake.tam ) / 2;
		bordeLat = ( panelPrincipal.getWidth() - snake.tam ) / 2;

		setupFondoPanel(panelPrincipal);
		setupPuntajeLabel(panelPrincipal);

		//pregunto cual es la opcion y pongo el modo de juego seleccionado

		switch (opcion) {
			case 0:
				modo = new Normal(panelPrincipal);
				setVisible(true);
				break;
			case 1:
				modo = new Contrarreloj(panelPrincipal);
				setVisible(true);
				break;
			case 2:
				fondo.setBarreras();
				modo = new ConBordes(panelPrincipal,snake);
				setVisible(true);
				break;
			default:
				JOptionPane.showMessageDialog(null,"No se puede seleccionar");
				System.exit(0);
				break;
			}
		
	}

	//Se configura el frame principal
	private void setupFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JFrameSnake.class.getResource("/img/snake.png")));
		setTitle("Snake - Game");
		addKeyListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 645);
	}

	//Se configura el contenedor principal de la interfaz gráfica
	private void setupContentPane() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	//Se configura el panel principal
	private JPanel setupPanelPrincipal() {
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(100, 130, 2));
		panelPrincipal.setBounds(0, 0, 559, 606);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		return panelPrincipal;
	}

	//Se configura la vibo de la serpiente
	private void setupSnakePanel(JPanel panelPrincipal) {
		snake = new PanelSnake(506,23);
		panelPrincipal.add(snake);
		snake.setBounds(26,50,505,505);
		snake.setLayout(null);
		snake.setOpaque(false);
	}

	//Se configura el panel de fondo
	private void setupFondoPanel(JPanel panelPrincipal) {
		fondo = new PanelFondo(506,23); // 506 pixeles de lado y 23 cuadrados de lado
		panelPrincipal.add(fondo);
		fondo.setBounds(bordeLat,bordeSup,505,505);
		fondo.setLayout(null);
		fondo.setOpaque(false);
	}

	//Se configura el panel de puntaje
	private void setupPuntajeLabel(JPanel panelPrincipal) {
		lblNewLabel = new JLabel("Puntaje :");
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 22));
		lblNewLabel.setBounds(337, 15, 119, 20);
		panelPrincipal.add(lblNewLabel);

		lblPuntaje = new JLabel( "0" ); // <--------------- CONTADOR
		lblPuntaje.setFont(new Font("Consolas", Font.BOLD, 22));
		lblPuntaje.setBounds(458, 15, 40, 20);
		panelPrincipal.add(lblPuntaje);
	}

	/** Boton para avanzar **/

	public void keyPressed(KeyEvent e) { // Evento en el JFrame
		if (e.getSource() == this) {
			keyPressedThis(e);
		}
	}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	protected void keyPressedThis(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT) { // ambos devuelven int: el codigo de la tecla
			snake.cambiarDireccion("de");
		}
		else if(e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT) {
			snake.cambiarDireccion("iz");
		}
		else if(e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP) {
			snake.cambiarDireccion("ar");
		}
		else if(e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN) {
			snake.cambiarDireccion("ab");
		}
	}
}




















