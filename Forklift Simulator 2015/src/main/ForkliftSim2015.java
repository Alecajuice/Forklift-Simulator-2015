package main;



import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class ForkliftSim2015 {
	
	public final int SCREEN_WIDTH = 1000;
	public final int SCREEN_HEIGHT = 1000;

	public static void main(String[] args) {
		new ForkliftSim2015();
	}
	
	public ForkliftSim2015() {
			
			try {
				Display.setDisplayMode(new DisplayMode(SCREEN_WIDTH, SCREEN_HEIGHT));
				Display.create();
			} catch (LWJGLException e) {
				System.err.print("Err 1:");
				e.printStackTrace();
			}
		
	}
}
