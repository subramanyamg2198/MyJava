package com.pack1;

public class C1 extends A1
{
	public static void main(String[] args) {
		//System.out.println(C1.i); i is private hence not inherited
		C1 ob=new C1();
		//System.out.println(ob.j); private members are not inherited in sub class object
	}
}  