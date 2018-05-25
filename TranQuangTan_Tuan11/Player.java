import java.awt.Color;
import java.awt.Graphics;

public class Player {
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
	
	public Player() {
		this.x = this. y = 0;
	}
	
	public Player(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public void drawPlayer(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 200, 40);
	}
	
	public void diChuyenTrai() {
		if(x > 0) {
			x -= 10;
//			System.out.println(x);
		}
	}
	
	public void diChuyenPhai() {
		if(x <= 1200 - 200) {
			x += 10;
		}
	}
}
