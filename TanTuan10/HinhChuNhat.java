import java.awt.Graphics;


public class HinhChuNhat {
	private int x, y;
	private boolean phai = true;
	private boolean len = true;
	private int huong = 1;
	private int huong1 = 1;
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
	
	public HinhChuNhat(){
		x = y = 0;
	}
	
	public HinhChuNhat(int x, int y){
		this.x = x; this.y = y;
	}
	public void drawHCN(Graphics g){
		g.fillRect(x, y, 30, 30);
	}
	
	public void diChuyen(){
		xacDinhHuong();
//		if(phai) x += 10; else x -= 10;
//		if(len) y += 10; else y -= 10;
		x += huong*10;
//		y += huong1*10;
	}
	
	public void xacDinhHuong(){
//		if(x >= 460) phai = false;
//		if(x < 0) phai = true;
//		if(y >= 350) len = false;
//		if(y < 0) len = true;
		if(x >= 460) huong *= -1;
//		if(y >= 340 || y < 0) huong1 *= -1;
	}
}
