import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel{
	HinhChuNhat h1, h2;
	Timer t;
	Player p;
	private boolean trai, phai, len, xuong;
	
	public MyPanel() {
		this.setPreferredSize(new Dimension(1200, 400));
		h1 = new HinhChuNhat(40, 40);
		h2 = new HinhChuNhat(80, 80);
		p = new Player(600, 300);
		Timerhandler handler = new Timerhandler();
		PlayerHandler phandler = new PlayerHandler();
		this.addKeyListener(phandler);
		this.setFocusable(true);
		t = new Timer(100, handler);
		t.start();
	}
	
	class PlayerHandler implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				trai = true;
				phai = len = xuong = !trai;
			}
			if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				phai = true;
				trai = len = xuong = !phai;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT) trai = false;
			if(e.getKeyCode() == KeyEvent.VK_RIGHT) phai = false;
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class Timerhandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			h1.diChuyen(p);
			h2.diChuyen(p);
			diChuyenPlayer();
			repaint();
		}
		
		public void diChuyenPlayer() {
			if(trai) p.diChuyenTrai();
			if(phai) p.diChuyenPhai();
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		h1.drawHinhChuNhat(g);
		h2.drawHinhChuNhat(g);
		p.drawPlayer(g);
	}
}
