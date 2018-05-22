import javax.swing.JFrame;


public class MyFrame extends JFrame{
	MyPanel panel;
	public MyFrame() {
		panel = new MyPanel();
		this.add(panel);
	}
}
