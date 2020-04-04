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
	private String[] saveRating, saveName, saveDate, saveType; 
	
	

	public Logic(PApplet app) {
		// TODO Auto-generated constructor stub
		this.app = app;
		list = new LinkedList<Netflix>();
		infoMovies = app.loadStrings("./../data/netflix.txt");
		sName = new SortName();
		sType = new SortType();
		sDate = new SortDate();
		
		saveDate = new String[6];
		saveName = new String[6];
		saveRating = new String[6];
		saveType = new String[6];
		
		for(int i=0; i<infoMovies.length; i++) {
			takeMovies = infoMovies[i].split(",");
			
			
	
			imgName= takeMovies[0].toLowerCase().replaceAll("\\s", "");
			
			img = app.loadImage("./../dataImages/"+ imgName + ".jpg");
			
			name = takeMovies[0];
			date = Integer.parseInt(takeMovies[1]);
			rating = Integer.parseInt(takeMovies[2]);
			type = takeMovies[3];
			
			list.add(new Netflix(img, name, date, rating, type,app));
		}
	}
	
	public void sortList(char c) {
		switch (c) { 
		case 'l':
				Collections.sort(list);
				for (int i = 0; i < list.size(); i++) {

					String name = list.get(i).getName();
					String date = Integer.toString(list.get(i).getDate());
					String rating = Integer.toString(list.get(i).getRating());
					String type = list.get(i).getType();
					
					String element = name + "," + date + "," + rating + "," + type ;

					saveRating[i] = element;

					app.saveStrings("Rating.txt", saveRating);
				}
			break;
		case 'n':
				Collections.sort(list,sName);
				for (int i = 0; i < list.size(); i++) {

					String name = list.get(i).getName();
					String date = Integer.toString(list.get(i).getDate());
					String rating = Integer.toString(list.get(i).getRating());
					String type = list.get(i).getType();
					
					String element = name + "," + date + "," + rating + "," + type ;

					saveName[i] = element;

					app.saveStrings("Name.txt", saveName);
				}
			break;
		case 'd':
				Collections.sort(list,sDate);
				for (int i = 0; i < list.size(); i++) {

					String name = list.get(i).getName();
					String date = Integer.toString(list.get(i).getDate());
					String rating = Integer.toString(list.get(i).getRating());
					String type = list.get(i).getType();
					
					String element = name + "," + date + "," + rating + "," + type ;

					saveDate[i] = element;

					app.saveStrings("Date.txt", saveDate);
				}
			break;
		case 't':
			Collections.sort(list,sType);
			for (int i = 0; i < list.size(); i++) {

				String name = list.get(i).getName();
				String date = Integer.toString(list.get(i).getDate());
				String rating = Integer.toString(list.get(i).getRating());
				String type = list.get(i).getType();
				
				String element = name + "," + date + "," + rating + "," + type ;

				saveType[i] = element;

				app.saveStrings("Type.txt", saveType);
			}
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
