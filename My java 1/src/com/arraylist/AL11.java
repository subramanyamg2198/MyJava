package com.arraylist;
import java.util.ArrayList;
public class AL11 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(30);
	for(int i=0;i<al.size();i++)
	{
		Integer ob=al.get(i);
		System.out.println(ob);
	}
}
}
