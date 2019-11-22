package com.staticmembers;

public class Demo6 {
	static int i=20;
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(Demo6.i);
		Demo6.i=40; 
		System.out.println();
	}
	}


