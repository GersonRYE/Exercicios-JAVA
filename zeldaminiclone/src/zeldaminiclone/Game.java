package zeldaminiclone;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.nio.Buffer;

import javax.swing.JFrame;

//KeyListener - uma interface propria do java que me permite controlar(movimentar) o player
public class Game extends Canvas implements Runnable, KeyListener {

	// tamanho da janela do jogo
	public static int WIDTH = 480, HEIGHT = 480;

	public Player player;

	// criando uma nova dimensão para a janelas
	public Game() {
		this.addKeyListener(this);
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));

		// iniciando o player na posição 0,0
		player = new Player(0, 0);
	}

	// metodo responsavel pela logica do jogo
	public void tick() {
		player.tick();
	}

	// metodo onde toda renderização dos graficos ira ficar
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		// otimiza a parte grafica
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();

		// quando show foi declarado foi permitido usar cor
		g.setColor(Color.black); // cor do retangulo

		// cria o retangulo na tela, com suas dimensões
		g.fillRect(0, 0, WIDTH, HEIGHT);

		player.render(g);

		// Faz aparecer um quadrado vermelho na tela
		// g.setColor(Color.red);
		// g.fillRect(0, 0, 50, 50);

		// mostrar o que tem
		bs.show();

	}

	public static void main(String[] args) {
		// instanciando a classe GAME
		Game game = new Game();

		// Criando uma janela
		JFrame frame = new JFrame();

		frame.add(game);
		frame.setTitle("Mini Zelda");

		// serve para empacotar todos os frames e calcular o tamanho certo da janela
		frame.pack();

		frame.setLocationRelativeTo(null);

		// o metodo utilizado sera para quando fechar o JFrame, é para todo o processo
		// do
		// java ser fechado e nenhuma memoria ficar armazenado no computador do usuario
		// que estiver jogando
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// vera janela que ira executar o jogo
		frame.setVisible(true);

		// mantem o jogo em looping, mantem o jogo redenrizando cada ação que o usuario
		// faz na tela
		new Thread(game).start();
	}

	@Override
	public void run() {

		// loop infinito quyue todo jogo tem independente da complexidade do jogo, tudo
		// para manter a renderização de cada ação do usuario no jogo
		while (true) {
			tick();
			render();

			// roda o jogo a 60fps
			try {
				Thread.sleep(1000 / 60);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.right = true;
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			player.left = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			player.up = true;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			player.down = true;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.right = false;
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			player.left = false;
		}

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			player.up = false;
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			player.down = false;
		}
	}

}
