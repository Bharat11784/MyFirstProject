package com.sort.list;

public class Emply implements Comparable<Emply> {
	
	int id;
	String name;
	public Emply(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		
		
		
	}
	@Override
	public int compareTo(Emply e1) {

       if(id==e1.id)
		return 0;
       else if(id<e1.id)
    	   return 1;
       else
    	   return -1;
	}
	

}
