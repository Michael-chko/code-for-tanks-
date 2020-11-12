
public class Game {

	public static void main(String[] args) {
		
		Map.generate(100, 100);
		ImageHelper.loadTexture("sprites.png");
		ImageHelper.cropImage(0, 2, Map.GROUND);
		ImageHelper.cropImage(0, 3, Map.WATER);
		ImageHelper.cropImage(1, 0, Map.WALL);
		ImageHelper.cropImage(1, 1, Map.BRICK);
		
		Window w = new Window();
		
		

	}

}
