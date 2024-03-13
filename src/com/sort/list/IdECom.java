package com.sort.list;

import java.util.Comparator;

public class IdECom implements Comparator<Empl> {

	@Override
	public int compare(Empl e1, Empl e2) {
		if(e1.eid==e2.eid)
		return 0;
		else if(e1.eid>e1.eid)
			return 1;
		else
			return -1;
	}

}
