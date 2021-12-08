package zeldaminiclone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;



public class SpriteSheet {
	
	public static BufferedImage spritesheet;

	public static BufferedImage player_front;
	
	public static BufferedImage tileWall;
	
	//buscando a imagem
	public SpriteSheet() {
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// tamanho e local da imagem no springsheet.png
		player_front = SpriteSheet.getSprite(0,11,16,16);
		tileWall = SpriteSheet.getSprite(214, 208, 16, 16);
	}
	
	// metodo para pegar subimage
	public static BufferedImage getSprite(int x, int y, int width, int height) {
		return spritesheet.getSubimage(x, y, width, height);
	}
	
}
