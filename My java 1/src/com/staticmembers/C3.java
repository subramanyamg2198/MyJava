package com.staticmembers;

public class C3 
{
	static int i=10;
	public static void main(String[] args) {
		System.out.println(C3.i);
		i=30;
		System.out.println(C3.i);
	}
}
