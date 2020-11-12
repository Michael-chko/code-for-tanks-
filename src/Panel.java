import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel {

	public Panel () {
		
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		//g.fillRect(0, 0, 500, 200);
		Map.paint(g);
		
	}
	
	
	
}
