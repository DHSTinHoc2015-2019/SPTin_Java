import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel{
	HinhChuNhat hcn;
	Timer t;
	public MyPanel()
	{
		hcn = new HinhChuNhat(30, 30);
		TimerHandler handler = new TimerHandler();
		t = new Timer(50, handler);
		t.start();
	}
	class TimerHandler implements ActionListener {
		public void actionPerformed (ActionEvent arg0) {
			hcn.diChuyen();			
			repaint();
		}
	}
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		hcn.drawHCN(g);	
	}
}
