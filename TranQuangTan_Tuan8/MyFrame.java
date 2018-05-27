package javaTuan8;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	HinhTron ht = new HinhTron(100, 100);
	
	public MyFrame(){
		this.add(ht);		
	}
}
