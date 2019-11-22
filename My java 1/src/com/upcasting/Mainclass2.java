package com.upcasting;

public class Mainclass2 {
	public static void main(String[] args) {
		B1 obj1=new C1();
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		//System.out.println(obj1.k);
		
		A1 obj2=new B1();
		System.out.println(obj2.i);
		//System.out.println(obj2.j);
		//System.out.println(obj2.k);
		
		A1 obj3=obj1;
		System.out.println(obj3.i);
		//System.out.println(obj3.j);
		//System.out.println(obj3.k);
		
	}

}
