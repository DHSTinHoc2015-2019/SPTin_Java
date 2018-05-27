import java.awt.Graphics;

public class HinhChuNhat{
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public HinhChuNhat() {
		x = y = 0;
	}
	
	public HinhChuNhat(int x, int y) {
		this.x =x; this.y = y;
	}
	
	public void drawHCN(Graphics g) {
		g.fillRect(x, y, 50, 30);
	}
	
	public void move(int a, int b) {
		x += a; y += b;
	}
}
