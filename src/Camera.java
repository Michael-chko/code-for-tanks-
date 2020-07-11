
public class Camera {

	private static double x = 0, y = 5 * Map.BLOCK_SIZE;
	private static int    w = 800, h = 600;
	
	
	public static void move () {
		
	}
	
	public static void setPosition (double x, double y) {
		Camera.x = x;
		Camera.y = y;
		
		if (Camera.x < 0) {
			Camera.x = 0;
		}
		if (Camera.y < 0) {
			Camera.y = 0;
		}
		if (Camera.x > Map.getWorldWidth() - w) {
			Camera.x = Map.getWorldWidth() - w;
		}
		
		if (Camera.y > Map.getWorldHeight() - h) {
			Camera.y = Map.getWorldHeight() - h;
		}
		
	}
	
	public static int getScreenX (double X) {
		return (int)(X - Camera.x);
	}
	public static int getScreenY (double Y) {
		return (int)(Y - Camera.y);
	}
	
}
