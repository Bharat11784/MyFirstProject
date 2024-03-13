package com.sort.list;

import java.util.ArrayList;
import java.util.Collections;

public class Test8 {

	public static void main(String[] args) {

     ArrayList<Empl>j=new ArrayList<Empl>();
     j.add(new Empl(888,"mahanth"));
     j.add(new Empl(111,"bharat"));
     j.add(new Empl(555,"savita"));
     j.add(new Empl(222,"navami"));
     
     Collections.sort(j,new IdECom());
     
     for(Empl s:j) {
    	 System.out.println(s.eid+" "+s.name);
     }

	}

}
