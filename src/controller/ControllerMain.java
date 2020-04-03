package controller;

import model.Logic;
import processing.core.PApplet;

public class ControllerMain {

	private PApplet app;
	private Logic logic;

	public ControllerMain(PApplet app) {
		this.app = app;
		logic = new Logic(app);
	}
	
	
}
