package zeldaminiclone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Blocks extends Rectangle {
	
	private static final long serialVersionUID = 1L;

	public Blocks(int x, int y) {
		// especificando as dimensões dos blocos
		super(x, y, 32, 32);
	}
	
	public void render (Graphics g) {
		// cor do bloco
		//g.setColor(Color.DARK_GRAY);
		//g.fillRect(x,  y, width, height);
		//Cor da Borda do bloco
		//g.setColor(Color.BLACK);
		//g.drawRect(x, y, width, height);
		
		//formatando os blocos, buscando a imagem no springsheet
		g.drawImage(SpriteSheet.tileWall, x, y, 32, 32, null);
		
	}
}
