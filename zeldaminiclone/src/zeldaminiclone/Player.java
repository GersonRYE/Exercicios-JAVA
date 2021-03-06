package zeldaminiclone;

import java.awt.Color;
import java.awt.Graphics;

// nesta biblioteca tem os recursos para a movimenta??o do player
import java.awt.Rectangle;

public class Player extends Rectangle {
	
	//velocidade do player
	public int spd = 4;
	
	//todas as dire??es do player
	public boolean right, up, down, left;

	//parametros declarados da posi??o do player
	public Player (int x, int y) {
		
		//o (..., 32,32) significa a altura do player
		super(x, y, 32,32);
	}
	
	// neste metodo fica a logica 
	public void tick() {
		if(right && World.isFree(x+spd, y)) {
			x+=spd;
		}else if(left && World.isFree(x-spd, y)) {
			x-=spd;
		}
		
		if(up && World.isFree(x, y-spd)) {
			y-=spd;
		}else if(down && World.isFree(x, y+spd)) {
			y+=spd;
		}
	}
	
	//metodo dos graficos
	public void render(Graphics g) {
		//g.setColor(Color.blue);
		//g.fillRect(x, y, width, height);
		//renderizando uma imagem nas posi??es x e y , e tamanho 32 x 32
		g.drawImage(SpriteSheet.player_front, x, y, 32,32, null);
		
	}
}
