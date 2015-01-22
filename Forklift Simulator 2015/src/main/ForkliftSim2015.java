package main;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.openal.AL10.*;
import graphics.Node;
import graphics.Vector;

import org.lwjgl.LWJGLException;
import org.lwjgl.openal.AL;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.Drawable;
import org.lwjgl.opengl.SharedDrawable;

public class ForkliftSim2015 {
	
	public final int SCREEN_WIDTH = 700;
	public final int SCREEN_HEIGHT = 700;
	public final int UPDATE_SPEED = 60;

	public static void main(String[] args) {
		new ForkliftSim2015();
	}
	
	private ForkliftSim2015() {
			
			try {
				Display.setDisplayMode(new DisplayMode(SCREEN_WIDTH, SCREEN_HEIGHT));
				Display.create();
			} catch (LWJGLException e) {
				System.err.print("Err 1:");
				e.printStackTrace();
	            System.exit(0);
			}
			
			glMatrixMode(GL_PROJECTION);
			glLoadIdentity();
			glOrtho(0, SCREEN_WIDTH, SCREEN_HEIGHT, 0, 1, -1);
			glMatrixMode(GL_MODELVIEW);
			glEnable(GL_TEXTURE_2D);
		
			mainLoop();
			
			Display.destroy();
			System.exit(0);
	}
	
	private void mainLoop() {
		
		while(!Display.isCloseRequested()) {
			update();
			render();
		}
	}

	private void update() {

		System.out.println(getMouseX());

	}
	
	private int getMouseX() {
		return Mouse.getX();
	}
	
	private int getMouseY() {
		return Mouse.getY();
	}

	private void render() {
		Display.update();
		Display.sync(UPDATE_SPEED);
		
	}
	
}
