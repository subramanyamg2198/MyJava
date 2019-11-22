package com.set;
import java.util.HashSet;

public class HS1 {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	System.out.println(hs.isEmpty());
	System.out.println(hs.size());
	hs.add(10);
	hs.add(30);
	hs.add(22);
	hs.add("hello");
	System.out.println(hs);
	System.out.println(hs.add(null));
	System.out.println(hs.add(null));
	System.out.println(hs.contains(30));
	System.out.println(hs.contains(6));
	System.out.println(hs);
	System.out.println(hs); 
	hs.clear();
	System.out.println(hs);
}
}
