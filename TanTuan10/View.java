import javax.swing.JFrame;

public class View {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setVisible(true);
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
