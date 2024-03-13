package com.sort.list;

import java.util.ArrayList;
import java.util.Collections;

public class Test9 {

	public static void main(String[] args) {
		
		ArrayList<Emply> h=new ArrayList<Emply>();
		
		h.add(new Emply(666,"bharat"));
		h.add(new Emply(222,"mahanth"));
		h.add(new Emply(555,"savita"));
		h.add(new Emply(111,"navamu"));
		
		Collections.sort(h);
		for(Emply b:h) {
			System.out.println(b.id+" "+b.name);
		}

	}

}
