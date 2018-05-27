import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HinhTamGiac extends JPanel{
	
	JLabel lbl1, lbl2, lbl3, lbl4, lbl5;
	JButton btnKetQua, btnXoaText;
	JTextField txtCanh1, txtCanh2, txtCanh3, txtChuVi, txtDienTich;
	
	public HinhTamGiac() {
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);
		
		lbl1 = new JLabel("HÌNH TAM GIÁC");
		lbl1.setFont(new Font("Time New Roman", 1, 26));
		lbl1.setBounds(120, 20, 300, 26);
		this.add(lbl1);
		
		lbl1 = new JLabel("Nhập độ dài cạnh 1");
		lbl1.setFont(new Font("Time New Roman", 0, 18));
		lbl1.setBounds(40, 80, 200, 20);
		this.add(lbl1);
		
		txtCanh1 = new JTextField();
		txtCanh1.setFont(new Font("Time New Roman", 2, 18));
		txtCanh1.setBounds(210, 80, 200, 26);
		this.add(txtCanh1);
		
		lbl2 = new JLabel("Nhập độ dài cạnh 2");
		lbl2.setFont(new Font("Time New Roman", 0, 18));
		lbl2.setBounds(40, 120, 200, 20);
		this.add(lbl2);

		txtCanh2 = new JTextField();
		txtCanh2.setFont(new Font("Time New Roman", 2, 18));
		txtCanh2.setBounds(210, 120, 200, 26);
		this.add(txtCanh2);
		
		lbl3 = new JLabel("Nhập độ dài cạnh 3");
		lbl3.setFont(new Font("Time New Roman", 0, 18));
		lbl3.setBounds(40, 160, 200, 20);
		this.add(lbl3);
		
		txtCanh3 = new JTextField();
		txtCanh3.setFont(new Font("Time New Roman", 2, 18));
		txtCanh3.setBounds(210, 160, 200, 26);
		this.add(txtCanh3);
		
		btnKetQua = new JButton("Kết quả");
		btnKetQua.setFont(new Font("Time New Roman", 1, 16));
		btnKetQua.setBounds(100, 200, 100, 30);
		this.add(btnKetQua);
		
		btnXoaText = new JButton("Xóa text");
		btnXoaText.setFont(new Font("Time New Roman", 1, 16));
		btnXoaText.setBounds(250, 200, 100, 30);
		this.add(btnXoaText);
		
		lbl4 = new JLabel("Chu vi");
		lbl4.setFont(new Font("Time New Roman", 0, 18));
		lbl4.setBounds(40, 250, 150, 20);
		this.add(lbl4);
		
		txtChuVi = new JTextField();
		txtChuVi.setFont(new Font("Time New Roman", 2, 18));
		txtChuVi.setBounds(150, 250, 250, 26);
		this.add(txtChuVi);

		lbl5 = new JLabel("Diện tích");
		lbl5.setFont(new Font("Time New Roman", 0, 18));
		lbl5.setBounds(40, 290, 150, 20);
		this.add(lbl5);
		
		txtDienTich = new JTextField();
		txtDienTich.setFont(new Font("Time New Roman", 2, 18));
		txtDienTich.setBounds(150, 290, 250, 26);
		this.add(txtDienTich);
		
		Bhandler handler = new Bhandler();
		btnKetQua.addActionListener(handler);
		btnXoaText.addActionListener(handler);
	}
	
	class Bhandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == btnXoaText) {
				txtCanh1.setText(""); txtCanh2.setText(""); txtCanh3.setText(""); txtChuVi.setText(""); txtDienTich.setText("");
			}
			
			if(e.getSource() == btnKetQua) {
				double a = 0, b = 0, c = 0;
				boolean check = true, kiemTraTamGiac = true;
				try {
					a = Double.valueOf(txtCanh1.getText());
					b = Double.valueOf(txtCanh2.getText());
					c = Double.valueOf(txtCanh3.getText());
					check = true;
					if (a+b>c && b+c>a && a+c>b) kiemTraTamGiac = true;
					else kiemTraTamGiac = false;
				} catch (Exception e2) {
					check = false;
					kiemTraTamGiac = false;
					JOptionPane.showMessageDialog(null, "Nhập sai dữ liệu\nVui lòng nhập lại", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}
				if(check && kiemTraTamGiac) {
					double p = (a + b + c)/2;
					txtChuVi.setText(String.valueOf(p * 2));
					txtDienTich.setText(String.valueOf(Math.sqrt(p * (p - a) * (p - b) * (p - c))));
				}
				else JOptionPane.showMessageDialog(null, "Dữ liệu bạn nhập vào không phải là độ dài ba cạnh của một tam giác\nVui lòng nhập lại", "Lỗi", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
