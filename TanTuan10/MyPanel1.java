import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
		PlayerHandler pHandler = new PlayerHandler();
		this.addKeyListener(pHandler);
		this.setFocusable(true);
		t = new Timer(50, handler);
		t.start();
	}
	
	class TimerHandler implements ActionListener {
		public void actionPerformed (ActionEvent arg0) {
			hcn.diChuyen();			
			repaint();
		}
	}
	
	class PlayerHandler implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			int code = e.getKeyCode();
			if(code == KeyEvent.VK_LEFT) 
				System.out.println("left");
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		hcn.drawHCN(g);	
	}
}
