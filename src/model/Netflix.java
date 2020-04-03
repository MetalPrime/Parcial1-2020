package model;

import processing.core.PImage;

public class Netflix implements Comparable<Netflix>{

	private PImage img;
	private int date;
	private String name;
	private int rating;
	private String type;

	public Netflix(PImage img, String name, int date, int rating, String type) {
		this.img = img;
		this.name = name;
		this.date = date;
		this.rating = rating;
		this.type = type;
	}

	public void paint() {
		
	}

	@Override
	public int compareTo(Netflix o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
