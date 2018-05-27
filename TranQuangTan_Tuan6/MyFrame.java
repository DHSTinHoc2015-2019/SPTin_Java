import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Arrays;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	public MyFrame() {
		JPanel pnMain, pnTrai, pnTren, pnGiua;
		JLabel lbl1, lblMa, lblHoTen, lblNgaySinh, lblGioiTinh, lblQueQuan, lblNgay, lblThang, lblNam, lblEmail, lblSdt, lblSoThich;
		JTextField txtMa, txtHoTen, txtQueQuan, txtEmail, txtSdt;
		JComboBox<String> cboNgay, cboThang, cboNam;
		JRadioButton rbNam, rbNu;
		JTextArea taSoThich;
		JButton btnDangKy, btnHuy;
		
		pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout());
		this.add(pnMain);
		
		pnTren = new JPanel();
		//pnTren.setBackground(Color.YELLOW);
		pnMain.add(pnTren, BorderLayout.NORTH);
		
		pnTrai = new JPanel();
		//pnTrai.setBackground(Color.RED);
		pnMain.add(pnTrai, BorderLayout.WEST);
		
		pnGiua = new JPanel();
		//pnGiua.setBackground(Color.BLUE);
		pnMain.add(pnGiua, BorderLayout.CENTER);
		
		pnTren.setLayout(null);
		pnTren.setPreferredSize(new Dimension(0, 100));
		lbl1 = new JLabel("THÔNG TIN SINH VIÊN");
		lbl1.setFont(new Font("Time New Roman", 1, 30));
		lbl1.setBounds(100, 30, 400, 30);
		pnTren.add(lbl1);
		
		//Trái
		pnTrai.setLayout(null);
		pnTrai.setPreferredSize(new Dimension(150, 0));
		lblMa = new JLabel("Mã sinh viên");
		lblMa.setFont(new Font("Time New Roman", 0, 16));
		lblMa.setBounds(20, 0, 100, 20);
		pnTrai.add(lblMa);
		
		lblHoTen = new JLabel("Họ và tên");
		lblHoTen.setFont(new Font("Time New Roman", 0, 16));
		lblHoTen.setBounds(20, 40, 100, 20);
		pnTrai.add(lblHoTen);
		
		lblNgaySinh = new JLabel("Ngày sinh");
		lblNgaySinh.setFont(new Font("Time New Roman", 0, 16));
		lblNgaySinh.setBounds(20, 80, 100, 20);
		pnTrai.add(lblNgaySinh);
		
		lblGioiTinh = new JLabel("Giới tính");
		lblGioiTinh.setFont(new Font("Time New Roman", 0, 16));
		lblGioiTinh.setBounds(20, 120, 100, 20);
		pnTrai.add(lblGioiTinh);
		
		lblQueQuan = new JLabel("Quê quán");
		lblQueQuan.setFont(new Font("Time New Roman", 0, 16));
		lblQueQuan.setBounds(20, 160, 100, 20);
		pnTrai.add(lblQueQuan);	
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Time New Roman", 0, 16));
		lblEmail.setBounds(20, 200, 100, 20);
		pnTrai.add(lblEmail);
		
		lblSdt = new JLabel("Số điện thoại");
		lblSdt.setFont(new Font("Time New Roman", 0, 16));
		lblSdt.setBounds(20, 240, 100, 20);
		pnTrai.add(lblSdt);
		
		lblSoThich = new JLabel("Sở thích");
		lblSoThich.setFont(new Font("Time New Roman", 0, 16));
		lblSoThich.setBounds(20, 280, 100, 20);
		pnTrai.add(lblSoThich);
		
		//Giữa
		pnGiua.setLayout(null);
		
		txtMa = new JTextField();
		txtMa.setFont(new Font("Time New Roman", 2, 16));
		txtMa.setBounds(0, 0, 350, 30);
		pnGiua.add(txtMa);
		
		txtHoTen = new JTextField();
		txtHoTen.setFont(new Font("Time New Roman", 2, 16));
		txtHoTen.setBounds(0, 40, 350, 30);
		pnGiua.add(txtHoTen);
		
		lblNgay = new JLabel("Ngày");
		lblNgay.setFont(new Font("Time New Roman", 2, 16));
		lblNgay.setBounds(0, 80, 40, 20);
		pnGiua.add(lblNgay);
		
		String [] arrNgay = new String[31];
		int ngay = 0;
		while(ngay <= 30) {
			arrNgay[ngay] = Integer.toString(++ngay);
		}
		
		cboNgay = new JComboBox<String>(arrNgay);
		cboNgay.setFont(new Font("Time New Roman", 2, 16));
		cboNgay.setBounds(50, 80, 50, 22);
		pnGiua.add(cboNgay);
		
		lblThang = new JLabel("Tháng");
		lblThang.setFont(new Font("Time New Roman", 2, 16));
		lblThang.setBounds(110, 80, 60, 20);
		pnGiua.add(lblThang);
		
		String [] arrThang = Arrays.copyOf(arrNgay, 12);
		
		cboThang = new JComboBox<String>(arrThang);
		cboThang.setFont(new Font("Time New Roman", 2, 16));
		cboThang.setBounds(170, 80, 50, 22);
		pnGiua.add(cboThang);
		
		lblNam = new JLabel("Năm");
		lblNam.setFont(new Font("Time New Roman", 2, 16));
		lblNam.setBounds(230, 80, 60, 20);
		pnGiua.add(lblNam);
		
		String [] arrNam = new String[100];
		int nam = 1960;
		while(nam <= 2059) {
			arrNam[nam - 1960] = Integer.toString(++nam);
		}
		
		cboNam = new JComboBox<String>(arrNam);
		cboNam.setFont(new Font("Time New Roman", 2, 16));
		cboNam.setBounds(280, 80, 70, 22);
		pnGiua.add(cboNam);
		
		rbNam = new JRadioButton("Nam");
		rbNam.setFont(new Font("Time New Roman", 2, 16));
		rbNam.setBounds(0, 120, 100, 20);
		pnGiua.add(rbNam);
		
		rbNu = new JRadioButton("Nữ");
		rbNu.setFont(new Font("Time New Roman", 2, 16));
		rbNu.setBounds(100, 120, 100, 20);
		pnGiua.add(rbNu);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbNu); bg.add(rbNam);
		
		txtQueQuan = new JTextField();
		txtQueQuan.setFont(new Font("Time New Roman", 2, 16));
		txtQueQuan.setBounds(0, 200, 350, 30);
		pnGiua.add(txtQueQuan);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Time New Roman", 2, 16));
		txtEmail.setBounds(0, 160, 350, 30);
		pnGiua.add(txtEmail);
		
		txtSdt = new JTextField();
		txtSdt.setFont(new Font("Time New Roman", 2, 16));
		txtSdt.setBounds(0, 240, 350, 30);
		pnGiua.add(txtSdt);
		
		taSoThich = new JTextArea();
		taSoThich.setBounds(0, 280, 350, 100);
		taSoThich.setFont(new Font("Time New Roman", 2, 16));
		pnGiua.add(taSoThich);
		
		btnDangKy = new JButton("Đăng ký");
		btnDangKy.setBounds(0, 400, 100, 30);
		btnDangKy.setFont(new Font("Time New Roman", 2, 16));
		pnGiua.add(btnDangKy);
		
		btnHuy = new JButton("Hủy");
		btnHuy.setBounds(200, 400, 100, 30);
		btnHuy.setFont(new Font("Time New Roman", 2, 16));
		pnGiua.add(btnHuy);
	}
}
