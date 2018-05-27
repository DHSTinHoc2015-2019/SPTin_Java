
public class SinhVien extends Nguoi {
	private double[] diem;
	private String ma;
	private int top; // Biến lưu số lần bổ sung vào mảng điểm

	// Constructor
	public SinhVien(String ma, String ten, int tuoi, String diaChi, double[] diem) {
		super();
		this.ma = ma;
		super.setTen(ten);
		super.setTuoi(tuoi);
		super.setDiaChi(diaChi);
		this.diem = diem;
		this.top = -1;
	}

	// Đóng gói Top
	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	// Đóng gói mảng Điểm
	public double[] getDiem() {
		return diem;
	}

	public void setDiem(double[] diem) {
		this.diem = diem;
	}

	// Đóng gói ma
	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	// Phương thức kiểm tra nếu chưa nhập bổ sung lần nào thì trả về true, ngược
	// lại false
	public boolean diemIsEmpty() {
		return this.getTop() == -1;
	}

	// Phương thức kiểm tra mảng điểm đã cho có thể bổ sung điểm được nữa hay không?
	// Nếu không còn trả về true, ngược lại false
	public boolean diemIsFull() {
		return this.getTop() >= this.getDiem().length;
	}

	// Phương thức bổ sung 1 điểm mới vào mảng diem
	public void boSungDiem(double a) {
		this.setTop(this.getTop() + 1); // Tăng số lần bổ sung điểm lên 1
		if (!diemIsFull()) { // Nếu mảng điểm còn chưa full thì bổ sung thêm điểm
			this.getDiem()[this.getTop()] = a;
		} else {
			System.out.println("Bạn không thể nhập thêm điểm cho sinh viên");
			this.setTop(this.getTop() - 1);
		}
	}

	public void HienThi() {
		System.out.println("Mã sinh viên: " + this.getMa());
		System.out.println("Tên sinh viên: " + this.getTen());
		System.out.println("Tuổi: " + this.getTuoi());
		System.out.println("Địa chỉ: " + this.getDiaChi());
		if (diemIsEmpty())
			System.out.println("Sinh viên chưa có điểm");
		else {
			System.out.println(this.getTop());
			System.out.print("Môn:   ");
			for (int i = 0; i <= this.getTop(); i++) {
				System.out.print("" + (i + 1) + "  |  ");
			}
			System.out.println();
			System.out.print("Điểm: ");
			for (int i = 0; i <= this.getTop(); i++) {
				System.out.print(this.getDiem()[i] + " | ");
			}
		}
	}
}
