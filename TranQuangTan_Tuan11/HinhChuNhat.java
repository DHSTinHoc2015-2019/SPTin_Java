import java.awt.Graphics;

public class HinhChuNhat {
	private int x, y;
	private int huongX = 1, huongY = 1;
	private boolean phai = true;
	
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
		this.x = x; this.y = y;
	}
	
	public void drawHinhChuNhat(Graphics g) {
		g.fillRect(x, y, 20, 20);
	}
	
	public void diChuyen(Player p) {
		if(x >= p.getX() && x < p.getX() + 200 && y == 300 || x >= p.getX() && x < p.getX() + 200 && y == 340) {
			huongY *= -1;
		}
		else {
			if(y >= 400 || y < 0) huongY *= -1;
			if(x >= 1200 || x < 0) huongX *= -1;
		}
		x += huongX * 20;
		y += huongY * 20;
	}
}
