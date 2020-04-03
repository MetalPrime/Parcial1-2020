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
		background(0);
		for(int i=0; i< controller.listNetflix().size(); i++) {
			controller.listNetflix().get(i).paint(i * 100, 150);
		}
		
		
		text("Press L to sort and save by Rating ", 100, 500);
		text("Press N to sort and save by Name ", 100, 525);
		text("Press D to sort and save by Date ", 100, 550);
		text("Press T to sort and save by Type ", 100, 575);

	}
	
	public void mousePressed() {
		
	}
	
	public void keyPressed() {
		System.out.println("toca");
		controller.selectChar(key);
	}

}
