
public class SinhVien {
	
	String ma, ten;
	double diemMon1, diemMon2, diemMon3, diemtb;
	
	public SinhVien(String ma, String ten, double diemMon1, double diemMon2, double diemMon3) {
		this.ma = ma;
		this.ten = ten;
		this.diemMon1 = diemMon1;
		this.diemMon2 = diemMon2;
		this.diemMon3 = diemMon3;
	}

	public double tinhDiemTB() {
		return Math.round((diemMon1 + diemMon2 + diemMon3)/3 * 100.0)/100.0;
	}
	
	public void hienThi() {
		System.out.println("Mã sinh viên: " + ma);
		System.out.println("Tên sinh viên: " + ten);
		System.out.println("- Điểm môn 1: " + diemMon1);
		System.out.println("- Điểm môn 2: " + diemMon2);
		System.out.println("- Điểm môn 3: " + diemMon3);
		diemtb = tinhDiemTB();
		System.out.println("=>Điểm trung bình: " + diemtb);
	}
	
	public static double tinhDiemTBMax(double [] arr) {
		double max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]) max = arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		SinhVien [] sv = {
				new SinhVien("SV001", "Nguyễn Văn Một", 7.0, 8.2, 8.9),
				new SinhVien("SV002", "Nguyễn Văn Hai", 7.1, 7.0, 8.3),
				new SinhVien("SV003", "Nguyễn Văn Ba", 7.5, 8.0, 9.5),
				new SinhVien("SV004", "Nguyễn Văn Bốn", 7.5, 7.5, 7.5),
				new SinhVien("SV005", "Nguyễn Văn Năm", 7.0, 8.0, 9.0)
				};
		
		for (int i = 0; i < sv.length; i++) {
			System.out.println("THÔNG TIN SINH VIÊN THỨ " + (i + 1) + ":");
			sv[i].hienThi();
			System.out.println("-------------------------------------------");
		}
		
		double [] arrTB = new double [sv.length];
		for (int i = 0; i < arrTB.length; i++) {
			arrTB[i] = sv[i].diemtb;
		}
		
		System.out.println("ĐIỂM TRUNG BÌNH MAX: " + SinhVien.tinhDiemTBMax(arrTB));
	}
}
