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

	/**
	 * @return the app
	 */
	public PApplet getApp() {
		return app;
	}

	/**
	 * @param app the app to set
	 */
	public void setApp(PApplet app) {
		this.app = app;
	}

	/**
	 * @return the img
	 */
	public PImage getImg() {
		return img;
	}

	/**
	 * @param img the img to set
	 */
	public void setImg(PImage img) {
		this.img = img;
	}

	/**
	 * @return the date
	 */
	public int getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(int date) {
		this.date = date;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	public void paint(int x, int y) {
		this.x = x;
		this.y = y;
		app.fill(255);
		app.image(img, x, y,50,100);
		app.text(name,x,y+125);
		app.text(date,x,y+150);
		app.text(rating + "%", x, y+175);
		app.text(type, x, y+200);
		
	}

	@Override
	public int compareTo(Netflix o) {
		// TODO Auto-generated method stub
		return this.rating-o.rating;
	}

}
