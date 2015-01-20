package main;



import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.openal.AL10.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.openal.AL;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.Drawable;
import org.lwjgl.opengl.SharedDrawable;

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
			
			glMatrixMode(GL_PROJECTION);
			glLoadIdentity();
			glOrtho(0, SCREEN_WIDTH, SCREEN_HEIGHT, 0, 1, -1);
			glMatrixMode(GL_MODELVIEW);
			glEnable(GL_TEXTURE_2D);
			
		
	}
}
