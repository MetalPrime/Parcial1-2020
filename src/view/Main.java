package view;

import controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}

	private ControllerMain controller;
	
	public void settings() {
		size(800,800);
	}
	
	public void setup() {
		controller = new ControllerMain(this);
	}
	
	public void draw() {
		
	}
	
	public void mousePressed() {
		
	}
	
	public void keyPressed() {
		
	}

}
