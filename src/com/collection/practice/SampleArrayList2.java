package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;

public class SampleArrayList2 {

	public static void main(String[] args) {

      ArrayList<Integer> y1=new ArrayList<Integer>();
      
      y1.add(65);
      y1.add(98);
      y1.add(54);
      y1.add(21);

      System.out.println(y1.contains(98));
      
      System.out.println(y1.isEmpty());
      
      Collections.sort(y1);
      System.out.println(y1);
      
      Collections.sort(y1,Collections.reverseOrder());
      System.out.println(y1);
      
      System.out.println();
      
      ArrayList clonedArray=(ArrayList)y1.clone();
      
      System.out.println(clonedArray);
      
      System.out.println(y1.size());
      
     
	}

}
