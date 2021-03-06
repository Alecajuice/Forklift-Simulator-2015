package graphics;

import org.lwjgl.util.Color;

public class Node {

	private int x;
	private int y;
	private int z;
	private int nodeSize;
	private Color color;
	
	public Node(int x, int y, int z,int nodeSize, Color color) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		this.nodeSize = nodeSize;
		this.color = color;
		
	}
	
	public Node(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.nodeSize = 1;
		this.color = (Color) Color.BLACK;
	}
	
	public Node() {
		x = 0;
		y = 0;
		z = 0;
		nodeSize = 1;
		color = (Color) Color.BLACK;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getZ() {
		return this.z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}

	public int getNodeSize() {
		return nodeSize;
	}

	public void setNodeSize(int nodeSize) {
		this.nodeSize = nodeSize;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	//puts vector at end of point
	public Node addV(Vector v) {
		this.x = x+v.getX();
		this.y = y+v.getY();
		this.z = z+v.getZ();
		return this;	
	}
	
	//puts -vector at point
	public Node subV(Vector v) {
		this.x = x-v.getX();
		this.y =  y-v.getY();
		this.z =  z-v.getZ();
		return this;
	}	
	
	//gives a Vector from this point to next point
	public Vector subN(Node n) {
		return new Vector(n.getX()-x, n.getY()-y, n.getZ()-z);
	}
	
	public void drawN() {
		System.out.println(x+" "+y+" "+z);
	}
}
