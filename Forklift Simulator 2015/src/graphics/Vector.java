package graphics;

public class Vector {

	private int x;
	private int y;
	private int z;
	
	public Vector() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Vector(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

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

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	//adds vector to vector?
	public Vector addV(Vector v) {
		return new Vector(x+v.getX(), y+v.getY(), z+v.getZ());
	}
	
	//subtract vector from vector
	public Vector subV(Vector v) {
		return new Vector(x-v.getX(), y-v.getY(), z-v.getZ());
	}
	
	public void drawV(Node node) {
		System.out.println(x+" "+y+" "+z);
	}
}
