package com.collection.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class SampleLinkedList3 {

	public static void main(String[] args) {
		
		LinkedList<Book> list=new LinkedList<Book>();
		
		list.add(new Book(1,"btd","nag","yhg",100));
		list.add(new Book(4,"atd","hega","kli",200));
		list.add(new Book(3, "turbo","venk","fgh",50));
		list.add(new Book(2,"hmt","raj","vbn",30));
		
		for(Book x:list) {
			System.out.println(x.id+" "+x.name+" "+x.author+" "+x.publisher+" "+x.quantity);
		}
		
		
	}

}


class Book{
	int id;
	String name;
	String author;
	String publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
}