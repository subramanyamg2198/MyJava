package com.arraylist;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class AL14 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList();
	al.add("Brahma");
	al.add("Vishnu");
	al.add("Mahesh");
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
}
}
