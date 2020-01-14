import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Rectangle;

public class Drawing extends Canvas {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Drawing");
		Canvas canvas = new Drawing();
		canvas.setSize(400,400);
		canvas.setBackground(Color.white);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
	}
	public void paint(Graphics g) {
		//japaneseFlag(g);
		recursiveMickey(g, new Rectangle(100,100,200,200));
		
	}
	public void japaneseFlag(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(200,100,200,200);
	}
	public void boxOval(Graphics g, Rectangle bb) {
	    g.fillOval(bb.x, bb.y, bb.width, bb.height);
	}
	public void mickey(Graphics g, Rectangle bb) {
		g.setColor(Color.black);
	    boxOval(g, bb);
	    int dx = bb.width / 2;
		int dy = bb.height / 2;
		Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);

		half.translate(-dx / 2, -dy / 2);
		boxOval(g, half);

		half.translate(dx * 2, 0);
		boxOval(g, half);
	}
	public void recursiveMickey(Graphics g, Rectangle bb) {
		g.setColor(Color.black);
	    boxOval(g, bb);
	    int dx = bb.width / 2;
    	int dy = bb.height / 2;
		Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);
	    if(dx >= 3) {
			half.translate(-dx / 2, -dy / 2);
			recursiveMickey(g, half);

			half.translate(dx * 2, 0);
			recursiveMickey(g, half);
	    }
	}
}