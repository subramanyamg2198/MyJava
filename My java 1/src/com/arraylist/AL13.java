package com.arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class AL13 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(5);
		//al.add("hello")
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}
	}


