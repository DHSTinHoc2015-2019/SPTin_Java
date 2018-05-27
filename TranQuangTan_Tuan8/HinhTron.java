package javaTuan8;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class HinhTron extends JComponent{
	private final int BANKINH = 30;
	private int toaDoX, toaDoY;
	
	public HinhTron() {
		toaDoX = toaDoY = 0;
	}
	
	public HinhTron(int x, int y) {
		toaDoX = x; toaDoY = y;
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.RED);
		g.drawOval(toaDoX, toaDoY, BANKINH * 2, BANKINH * 2);
		g.drawOval(toaDoX * 2, toaDoY, BANKINH * 2, BANKINH * 2);
	}
}
