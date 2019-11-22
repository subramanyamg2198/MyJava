package com.arraylist;
import java.util.ArrayList;
public class AL5 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(20);
	for(int i=0;i<al.size();i++)
	{
		Object x=al.get(i);
		Integer y=(Integer)x;
		System.out.println(y+2);
	}
}
}
