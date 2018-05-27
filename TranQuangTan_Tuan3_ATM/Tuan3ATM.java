import javax.swing.JOptionPane;

public class Tuan3ATM {

	public static final int maPin = 1234;
	public static void main(String[] args) {
		for (int i = 0; ; i++) {
			int nhapPin = Integer.parseInt(JOptionPane.showInputDialog("Nhap ma PIN: "));
			if(nhapPin == maPin) {
				JOptionPane.showMessageDialog(null, "So PIN hop le"); break;
			}
			else {
				if(i < 2) JOptionPane.showMessageDialog(null, "So PIN khong hop le");
				else {
					JOptionPane.showMessageDialog(null, "The cua ban da bi khoa. Xin vui long nhan tai ngan hang");
					break;
				}
			}
		}
	}

}
