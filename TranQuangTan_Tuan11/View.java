import javax.swing.JFrame;

public class View {

	public static void main(String[] args) {
		
		MyFrame frame = new MyFrame();
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
