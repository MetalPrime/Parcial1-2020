package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Netflix implements Comparable<Netflix>{

	private PApplet app;
	private PImage img;
	private int date;
	private String name;
	private int rating;
	private String type;
	private int x;
	private int y;
	

	public Netflix(PImage img, String name, int date, int rating, String type, PApplet app) {
		this.app = app;
		this.img = img;
		this.name = name;
		this.date = date;
		this.rating = rating;
		this.type = type;
	}

	public void paint(int x, int y) {
		this.x = x;
		this.y = y;
		app.image(img, x, y);
		
	}

	@Override
	public int compareTo(Netflix o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
