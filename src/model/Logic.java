package model;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	private String[] infoMovies;
	private String[] takeMovies;

	public Logic(PApplet app) {
		// TODO Auto-generated constructor stub
		this.app = app;
		infoMovies = app.loadStrings("./../data/netflix.txt");
		
		for(int i=0; i<infoMovies.length; i++) {
			takeMovies = infoMovies[i].split(",");
		}
	}

	
}
