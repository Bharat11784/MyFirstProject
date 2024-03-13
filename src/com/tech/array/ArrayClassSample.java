package com.tech.array;

import java.util.Arrays;

public class ArrayClassSample {
public static void main(String[]args) {
	
	char array[]= {'d','f','h','k','u','y','e','b'};
	
	//character to string//
	
/*	System.out.println(String.valueOf(array));
	
	//string to character//
	
	String str="bharatkumar";
	
char array1[]=str.toCharArray();
for(int i=0;i<array1.length;i++) {
	System.out.println(array1[i]);
} */


//char sorting//

Arrays.sort(array);

for(int i=0;i<array.length;i++) {
	System.out.println(array[i]);
}

/*int numarray[]= {3,7,9,2};
for(int e:numarray) {
	System.out.println(e);
}

Arrays.sort(numarray);

for(int f:numarray) {
	System.out.println(f);
}
*/

//
int empty[]=new int[10];

Arrays.fill(empty,1000);
System.out.println(empty[0]);
System.out.println(empty[1]);
System.out.println(empty[5]);
}

System.out.println(Arrays.binarySearch(array,'f'));

}
