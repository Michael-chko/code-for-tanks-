import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Map {
	
	public static final int BLOCK_SIZE = 32;
	
	public static final int GROUND = 0;
	public static final int WALL   = 1;
	public static final int WATER  = 2;
	public static final int BRICK  = 3;	
	
	private static int[][] matrix;
	
	public static int getWorldWidth() {
		return matrix[0].length * BLOCK_SIZE;
	}
	public static int getWorldHeight() {
		return matrix.length * BLOCK_SIZE;
	}
	
	
	public static void generate(int row, int col) {
		matrix = new int[row][col];
		
		for (int i = 0; i < col; i++) {
			matrix[0][i] 		= WALL;
			matrix[row - 1][i] 	= WALL;
		}
		for (int j = 1; j < row-1; j++) {
			matrix[j][0] 		= WALL;
			matrix[j][col-1] 	= WALL;
		}
		
		Random rand = new Random();
		
		for (int r = 1; r <= row-2; r++ ) {
			for (int c = 1; c <= col-2; c++) {
				if (rand.nextInt(7) == 0) {
					matrix[r][c] = rand.nextInt(4);
				}
				
			}
		}
		
	}
	
	public static void paint(Graphics g) {
		
		int firstRow = 5;
		int lastRow  = 15;
		int firstCol = 0;
		int lastCol  = 8;
		
		
		for (int row = firstRow; row <= lastRow; row++) {
			for (int col = firstCol; col <= lastCol; col++) {
				int cell = matrix[row][col];
				
				ImageHelper.paint(g, cell, Camera.getScreenX(col * 32), Camera.getScreenY(row * 32));
				
			}
			
		}
		
		
	}

}
