package graphics;

public class Vector {

	private int xMag;
	private int yMag;
	private int zMag;
	
	public Vector() {
		xMag = 0;
		yMag = 0;
		zMag = 0;
	}
	
	public Vector(int x, int y, int z) {
		xMag = x;
		yMag = y;
		zMag = z;
	}

	public int getxMag() {
		return xMag;
	}

	public void setxMag(int xMag) {
		this.xMag = xMag;
	}

	public int getyMag() {
		return yMag;
	}

	public void setyMag(int yMag) {
		this.yMag = yMag;
	}

	public int getzMag() {
		return zMag;
	}

	public void setzMag(int zMag) {
		this.zMag = zMag;
	}
}
