import javax.swing.JFrame;

public class MyFrame extends JFrame{
	MyPanel pn = new MyPanel();
	
	public MyFrame() {
		this.add(pn);
	}
}
