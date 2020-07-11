import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class ImageHelper {

	private static BufferedImage image;
	private static BufferedImage [] frames = new BufferedImage[121];

	public static void loadTexture(String fileName) {
		
		File f = new File(fileName);
		
		try {
			image = ImageIO.read(f);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Не найдена текстура "+fileName);
			System.exit(1);
		}
	
	}
	
	public static void cropImage(int row, int col,  int code) {
		
		int size = Map.BLOCK_SIZE;
		
		BufferedImage frame =  image.getSubimage(col * size, row * size, size, size);
		
		frames[code] = frame;
	}
	
	
	public static void paint (Graphics g, int code, int screenX, int screenY ) {
		g.drawImage(frames[code], screenX, screenY, null);
	}
	
}
