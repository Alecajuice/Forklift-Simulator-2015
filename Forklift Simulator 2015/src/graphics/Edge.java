package graphics;

import org.lwjgl.util.Color;


public class Edge {
	
	private Node node; 
	private Node aNode;
	private Color color;
	
	public Edge(Node node, Node anode, Color color) {
		
		this.node = node;
		this.aNode = node;
		this.color = color;
	}
}
