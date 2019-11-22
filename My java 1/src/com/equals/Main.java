package com.equals;

public class Main {
	public static void main(String[] args) {
		A ob1=new A(10);
		A ob2=new A(100);
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob1.equals(ob2));
		System.out.println(ob2.equals(ob2));
		System.out.println(ob1.equals(ob1));
		System.out.println(ob2.equals(ob1));
	}
}
