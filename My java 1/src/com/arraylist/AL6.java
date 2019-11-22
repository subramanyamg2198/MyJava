package com.arraylist;
import java.util.ArrayList;
public class AL6 {
public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	for(int i=0;i<al.size();i++) 
	{
		Integer x=al.get(i);
		System.out.println(x+2);
	}
}
}
