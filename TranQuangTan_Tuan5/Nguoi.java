
public class Nguoi {
	private String ten, diaChi;
	private int tuoi;

	// Constructor
	public Nguoi() {
		ten = diaChi = "";
		tuoi = 0;
	}

	// Constructor
	public Nguoi(String ten, String diaChi, int tuoi) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.tuoi = tuoi;
	}

	// Đóng gói ten
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	// Đóng gói diaChi
	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	// Đóng gói tuoi
	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
}
