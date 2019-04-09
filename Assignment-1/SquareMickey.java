import java.awt.*;

public class SquareMickey {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(220,150);
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();

		
		drawCircle(g, 50, 25, 40, 40);
		drawCircle(g, 130, 25, 40, 40);
		drawSquare(g, 68, 44, 80, 80);
		drawTheLine(g, 68, 84, 147, 84);
	}

	public static void drawTheLine(Graphics g, int x1, int x2, int y1, int y2 ) {
		g.setColor(Color.BLACK);
		g.drawLine(x1, x2, y1, y2);
		
	}

	public static void drawCircle(Graphics g, int x, int y, int width, int height) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, width, height);
	}

	public static void drawSquare(Graphics g, int x, int y, int width, int height) {
		g.setColor(Color.RED);   
		g.fillRect(x, y, width, height);
		
	}

}
