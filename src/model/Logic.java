package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {

	private PApplet app;
	private String[] infoMovies;
	private String[] takeMovies;
	private LinkedList <Netflix> list;
	private String imgName;
	private PImage img;
	private String name;
	private int date;
	private int rating;
	private String type;
	private SortName sName;
	private SortType sType;
	private SortDate sDate;
	

	public Logic(PApplet app) {
		// TODO Auto-generated constructor stub
		this.app = app;
		list = new LinkedList<Netflix>();
		infoMovies = app.loadStrings("./../data/netflix.txt");
		sName = new SortName();
		sType = new SortType();
		sDate = new SortDate();
		
		for(int i=0; i<infoMovies.length; i++) {
			takeMovies = infoMovies[i].split(",");
			
			
	
			imgName= takeMovies[0].toLowerCase();
			
			img = app.loadImage("./../dataImages/"+ imgName + ".jpg");
			
			name = takeMovies[0];
			date = Integer.parseInt(takeMovies[1]);
			rating = Integer.parseInt(takeMovies[2]);
			type = takeMovies[3];
			
			list.add(new Netflix(null, name, date, rating, type,app));
		}
	}
	
	public void sortList(char c) {
		switch (c) { 
		case 'L':
				Collections.sort(list);
			break;
		case 'n':
				Collections.sort(list,sName);
			break;
		case 'd':
				Collections.sort(list,sDate);
			break;
		case 't':
			Collections.sort(list,sType);
		break;

		}
		
	}

	/**
	 * @return the list
	 */
	public LinkedList<Netflix> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(LinkedList<Netflix> list) {
		this.list = list;
	}

	
}
