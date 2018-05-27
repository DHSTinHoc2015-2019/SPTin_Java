import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel{
	HinhChuNhat hcn1, hcn2;
	public MyPanel() {
		hcn1 = new HinhChuNhat(100, 100);
		hcn2 = new HinhChuNhat(100, 200);
		Timer t;
		TimerHandler handler = new TimerHandler();
		t = new Timer(200, handler);
		t.start();
	}
	
	class TimerHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			hcn1.move(10, 0);
			hcn2.move(10, 0);
			repaint();
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		hcn1.drawHCN(g);
		g.setColor(Color.RED);
		hcn2.drawHCN(g);
	}
}
