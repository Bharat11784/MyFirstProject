package com.tech.sort;
//sorting of ename using generic version of comparable//
public class Emp implements Comparable<Emp> {
	
	int eid;
	
	String ename;
	
	public Emp(int eid,String ename){
		
		this.eid=eid;
		this.ename=ename;
	}

	@Override
	public int compareTo(Emp e) {
		
		return ename.compareTo(e.ename);
	}
}

/* Limitations
    1. we are mixing sorting logics and business logics in single class
    2. one property sorting possible  */

/*to overcome these to limitations we have to use Comparator */