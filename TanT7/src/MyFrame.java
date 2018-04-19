import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


class MyFrame extends JFrame{
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setSize(650, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	JPanel pnTren, pnTrai;
	JPanel pnMain = new JPanel();
	JRadioButton rbtChuNhat, rbtTron, rbtTamGiac;
	ButtonGroup gr;
	JLabel lbl1;
	
	HinhChuNhat hcn = new HinhChuNhat();
	HinhTron ht = new HinhTron();
	HinhTamGiac tg = new HinhTamGiac();
	
	public MyFrame() {

		this.add(pnMain);
		
		pnMain.setLayout(new BorderLayout());
		
		pnTren = new JPanel();
		pnTren.setLayout(null);
		pnTren.setBackground(Color.YELLOW);
		pnTren.setPreferredSize(new Dimension(0, 80));
		pnMain.add(pnTren, BorderLayout.NORTH);
		
		lbl1 = new JLabel("CHƯƠNG TRÌNH TÍNH CHU VI DIỆN TÍCH");
		lbl1.setFont(new Font("Time New Roman", 1, 26));
		lbl1.setBounds(50, 30, 600, 26);
		pnTren.add(lbl1);
		
		pnTrai = new JPanel();
		pnTrai.setLayout(null);
		pnTrai.setBackground(Color.BLUE);
		pnTrai.setPreferredSize(new Dimension(180, 0));
		pnMain.add(pnTrai, BorderLayout.WEST);
		
		rbtChuNhat = new JRadioButton("Hình chữ nhật");
		rbtChuNhat.setFont(new Font("Time New Roman", 1, 16));
		rbtChuNhat.setBounds(20, 40, 150, 20);
		rbtChuNhat.setBackground(Color.BLUE);
		rbtChuNhat.setForeground(Color.WHITE);
		pnTrai.add(rbtChuNhat);
		
		rbtTron = new JRadioButton("Hình tròn");
		rbtTron.setFont(new Font("Time New Roman", 1, 16));
		rbtTron.setBounds(20, 80, 150, 20);
		rbtTron.setBackground(Color.BLUE);
		rbtTron.setForeground(Color.WHITE);
		pnTrai.add(rbtTron);
		
		rbtTamGiac = new JRadioButton("Hình tam giác");
		rbtTamGiac.setFont(new Font("Time New Roman", 1, 16));
		rbtTamGiac.setBackground(Color.BLUE);
		rbtTamGiac.setBounds(20, 120, 150, 20);
		rbtTamGiac.setForeground(Color.WHITE);
		pnTrai.add(rbtTamGiac);
		
		gr = new ButtonGroup();
		gr.add(rbtChuNhat); gr.add(rbtTron); gr.add(rbtTamGiac);
		
		pnMain.add(hcn, BorderLayout.CENTER);
		
		Bhanler handler = new Bhanler();
		rbtChuNhat.addActionListener(handler);
		rbtTron.addActionListener(handler);
		rbtTamGiac.addActionListener(handler);
	}

	class Bhanler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(rbtChuNhat.isSelected()) {
				hcn.setVisible(true);
				ht.setVisible(false);
				tg.setVisible(false);
				pnMain.add(hcn, BorderLayout.CENTER);
			}
			if(rbtTron.isSelected()) {
				ht.setVisible(true);
				hcn.setVisible(false);
				tg.setVisible(false);
				pnMain.add(ht, BorderLayout.CENTER);
			}
			if(rbtTamGiac.isSelected()) {
				ht.setVisible(false);
				hcn.setVisible(false);
				tg.setVisible(true);
				pnMain.add(tg, BorderLayout.CENTER);
			}
		}
		
	}
}





