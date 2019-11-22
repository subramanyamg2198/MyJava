package com.arraylist;
import java.util.ArrayList;
public class AL7 {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(20);
	al.add("Hello");
	for(Object x:	al)
	{
		if(x instanceof Integer)
		{
			Integer i=(Integer)x;
		System.out.println(i+2);
		}
		if(x instanceof String)
		{
		String i=(String)x;
		System.out.println(i+"world");
		}
		}
		
}
}
