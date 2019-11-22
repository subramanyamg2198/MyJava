package com.arraylist;
import java.util.ArrayList;
public class AL8 {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(10);
	al.add(20);
	al.add(30);
	for(Integer x:al)
	{
		
		System.out.println(x+2);
	}
}
}
