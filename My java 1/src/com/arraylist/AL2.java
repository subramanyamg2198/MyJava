package com.arraylist;
import java.util.ArrayList;
public class AL2 {
public static void main(String[] args) {
	ArrayList ls=new ArrayList();
	ls.add(10);
	ls.add("hello");
	System.out.println(ls.add(10));
	System.out.println(ls.add(null));
	System.out.println(ls);
	for(int i=0;i<ls.size();i++)
	{
		System.out.println(ls.get(i));
	}
	System.out.println(ls.get(10));
}
}
