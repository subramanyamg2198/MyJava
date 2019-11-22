package com.miscellanous;

public class Mainclass {
	static void display(A ob)
	{
		System.out.println(ob.i);
		System.out.println(ob.j);
		
	}
	public static void main(String[] args)
	{
	A ob1=new A(10,10.0);
	A ob2=new A(20,20.0);
	A ob3=new A(30,30.0);
	A ob4=new A(40,40.0);
	display(ob1);
	display(ob2);
	display(ob3);
	display(ob4);
	}

}
