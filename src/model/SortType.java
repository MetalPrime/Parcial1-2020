package model;

import java.util.Comparator;

public class SortType implements Comparator<Netflix> {



	@Override
	public int compare(Netflix o1, Netflix o2) {
		// TODO Auto-generated method stub
		return o1.getType().compareTo(o2.getType());
	}

}
