package com.sort.list;

import java.util.Comparator;

public class NameCom implements Comparator<Empl>{

	@Override
	public int compare(Empl e1, Empl e2) {

          
		return -e1.name.compareTo(e2.name);
	}

	
	

}
