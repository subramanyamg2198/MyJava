package com.nonstaticblock;

public class P1 {
	{
		System.out.println("from iib-1");
	}
	public static void main(String[] args) {
		P1 ob=new P1();
		System.out.println("*****");
		P1 obj=new P1();
	}
	{
		System.out.println("from iib-2");
	}
}
