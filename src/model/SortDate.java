package model;

import java.util.Comparator;

public class SortDate implements Comparator<Netflix>{

	@Override
	public int compare(Netflix o1, Netflix o2) {
		// TODO Auto-generated method stub
		return o1.getDate() - o2.getDate();
	}

	

}
