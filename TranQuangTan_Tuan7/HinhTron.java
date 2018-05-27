import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HinhTron extends JPanel{
	JLabel lbl1, lbl2, lbl3, lbl4;
	JButton btnKetQua, btnXoaText;
	JTextField txtBanKinh, txtChuVi, txtDienTich;
	
	public HinhTron() {
		this.setBackground(Color.PINK);
		this.setLayout(null);
		
		lbl1 = new JLabel("HÌNH TRÒN");
		lbl1.setFont(new Font("Time New Roman", 1, 26));
		lbl1.setBounds(150, 20, 300, 26);
		this.add(lbl1);
		
		lbl2 = new JLabel("Nhập bán kính");
		lbl2.setFont(new Font("Time New Roman", 0, 18));
		lbl2.setBounds(40, 80, 150, 20);
		this.add(lbl2);
		
		txtBanKinh = new JTextField();
		txtBanKinh.setFont(new Font("Time New Roman", 2, 18));
		txtBanKinh.setBounds(200, 80, 200, 26);
		this.add(txtBanKinh);
		
		btnKetQua = new JButton("Kết quả");
		btnKetQua.setFont(new Font("Time New Roman", 1, 16));
		btnKetQua.setBounds(100, 130, 100, 30);
		this.add(btnKetQua);
		
		btnXoaText = new JButton("Xóa text");
		btnXoaText.setFont(new Font("Time New Roman", 1, 16));
		btnXoaText.setBounds(250, 130, 100, 30);
		this.add(btnXoaText);
		
		lbl3 = new JLabel("Chu vi");
		lbl3.setFont(new Font("Time New Roman", 0, 18));
		lbl3.setBounds(40, 180, 150, 20);
		this.add(lbl3);
		
		txtChuVi = new JTextField();
		txtChuVi.setFont(new Font("Time New Roman", 2, 18));
		txtChuVi.setBounds(150, 180, 250, 26);
		this.add(txtChuVi);

		lbl4 = new JLabel("Diện tích");
		lbl4.setFont(new Font("Time New Roman", 0, 18));
		lbl4.setBounds(40, 220, 150, 20);
		this.add(lbl4);
		
		txtDienTich = new JTextField();
		txtDienTich.setFont(new Font("Time New Roman", 2, 18));
		txtDienTich.setBounds(150, 220, 250, 26);
		this.add(txtDienTich);
		
		Bhandler handler = new Bhandler();
		btnKetQua.addActionListener(handler);
		btnXoaText.addActionListener(handler);
	}
	
	class Bhandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnXoaText) {
				txtBanKinh.setText(""); txtChuVi.setText(""); txtDienTich.setText("");
			}
			if(e.getSource() == btnKetQua) {
				double r = 0;
				boolean check = true;
				try {
					r = Double.valueOf(txtBanKinh.getText());
					check = true;
				} catch (Exception e2) {
					check = false;
					JOptionPane.showMessageDialog(null, "Nhập sai dữ liệu\nVui lòng nhập lại", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}
				if(check) {
					txtChuVi.setText(String.valueOf(2 * r * Math.PI));
					txtDienTich.setText(String.valueOf(r * r * Math.PI));
				}
			}
		}
	}
}
