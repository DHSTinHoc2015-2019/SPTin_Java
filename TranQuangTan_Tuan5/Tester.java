import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// Khai báo 1 đối tượng sv thuộc lớp SinhVien
		SinhVien sv = new SinhVien("SV001", "Nguyễn Văn A", 21, "Huế", new double[10]);

		char ch; // Biến chọn của menu
		int cotDiem; // Số cột điểm cần bổ sung
		double d; // Điểm bổ sung

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("-----------------------------------");
			System.out.println("Nhập 1: Bổ sung thêm điểm");
			System.out.println("Nhập 2: Xem thông tin sinh viên");
			System.out.println("Nhập bất kỳ để thoát");
			System.out.println("-----------------------------------");
			ch = sc.next().charAt(0);
			switch (ch) {
			case '1':
				System.out.print("Số cột điểm cần bổ sung: ");
				cotDiem = sc.nextInt();
				System.out.println("Nhập điểm:");
				for (int i = 1; i <= cotDiem; i++) {
					d = sc.nextDouble();
					sv.boSungDiem(Math.round(d* 10.0)/10.0);
				}
				break;
			case '2':
				sv.HienThi();
				break;
			}
		} while (ch == '1' || ch == '2');
	}
}
