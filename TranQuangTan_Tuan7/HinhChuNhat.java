import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HinhChuNhat extends JPanel{
	JLabel lbl1, lbl2, lbl3, lbl4, lbl5;
	JButton btnKetQua, btnXoaText;
	JTextField txtChieuRong, txtChieuDai, txtChuVi, txtDienTich;
	
	public HinhChuNhat(){
		this.setBackground(Color.GREEN);
		this.setLayout(null);
		
		lbl3 = new JLabel("HÌNH CHỮ NHẬT");
		lbl3.setFont(new Font("Time New Roman", 1, 26));
		lbl3.setBounds(120, 20, 300, 26);
		this.add(lbl3);
		
		lbl1 = new JLabel("Nhập chiều rộng");
		lbl1.setFont(new Font("Time New Roman", 0, 18));
		lbl1.setBounds(40, 80, 150, 20);
		this.add(lbl1);
		
		txtChieuRong = new JTextField();
		txtChieuRong.setFont(new Font("Time New Roman", 2, 18));
		txtChieuRong.setBounds(200, 80, 200, 26);
		this.add(txtChieuRong);
		
		lbl2 = new JLabel("Nhập chiều dài");
		lbl2.setFont(new Font("Time New Roman", 0, 18));
		lbl2.setBounds(40, 120, 150, 20);
		this.add(lbl2);
		
		txtChieuDai = new JTextField();
		txtChieuDai.setFont(new Font("Time New Roman", 2, 18));
		txtChieuDai.setBounds(200, 115, 200, 26);
		this.add(txtChieuDai);
		
		btnKetQua = new JButton("Kết quả");
		btnKetQua.setFont(new Font("Time New Roman", 1, 16));
		btnKetQua.setBounds(100, 170, 100, 30);
		this.add(btnKetQua);
		
		btnXoaText = new JButton("Xóa text");
		btnXoaText.setFont(new Font("Time New Roman", 1, 16));
		btnXoaText.setBounds(250, 170, 100, 30);
		this.add(btnXoaText);
		
		lbl4 = new JLabel("Chu vi");
		lbl4.setFont(new Font("Time New Roman", 0, 18));
		lbl4.setBounds(40, 220, 150, 20);
		this.add(lbl4);
		
		txtChuVi = new JTextField();
		txtChuVi.setFont(new Font("Time New Roman", 2, 18));
		txtChuVi.setBounds(150, 220, 250, 26);
		this.add(txtChuVi);

		lbl5 = new JLabel("Diện tích");
		lbl5.setFont(new Font("Time New Roman", 0, 18));
		lbl5.setBounds(40, 260, 150, 20);
		this.add(lbl5);
		
		txtDienTich = new JTextField();
		txtDienTich.setFont(new Font("Time New Roman", 2, 18));
		txtDienTich.setBounds(150, 260, 250, 26);
		this.add(txtDienTich);
		
		Bhandler handler = new Bhandler();
		btnKetQua.addActionListener(handler);
		btnXoaText.addActionListener(handler);
	}
	
	class Bhandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == btnXoaText) {
				txtChieuRong.setText(""); txtChieuDai.setText(""); txtChuVi.setText(""); txtDienTich.setText("");
			}
			if(e.getSource() == btnKetQua) {
				double d = 0, r = 0;
				boolean check = true;
				try {
					d = Double.valueOf(txtChieuDai.getText());
					r = Double.valueOf(txtChieuRong.getText());
					check = true;
				} catch (Exception e2) {
					check = false;
					JOptionPane.showMessageDialog(null, "Nhập sai dữ liệu\nVui lòng nhập lại", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}
				if(check) {
					txtChuVi.setText(String.valueOf((d + r) * 2));
					txtDienTich.setText(String.valueOf(d * r));
				}
			}
		}
	}
}
