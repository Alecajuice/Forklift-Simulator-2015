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

}
