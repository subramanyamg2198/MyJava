package com.upcasting;

public class Mainclass {
	public static void main(String[] args) {
		A ob1=new B();
		System.out.println(ob1.i);
		//System.out.println(ob1.j);
		
		B ob2=new B();
		A ob3=ob2;
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		System.out.println(ob3.i);
		//System.out.println(ob3.j);
	}

}
