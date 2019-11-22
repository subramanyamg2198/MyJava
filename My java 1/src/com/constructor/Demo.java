package com.constructor;

public class Demo {
	{
		System.out.println("non-static block");
	}
	
	Demo()
	{
		System.out.println("Demo()");
	}
	Demo(int x)
	{
		this();
		System.out.println("Demo(int)");
	}
	Demo(float r)
	{
		this(9);
		System.out.println("Demo(float)");
	}
	public static void main(String[] args) {
		Demo ob1=new Demo();
		System.out.println("**********");
		Demo ob2=new Demo(10);
		System.out.println("**********");
		Demo ob3=new Demo(5.0f);
	}
		
	}



