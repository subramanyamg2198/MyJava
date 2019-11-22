package com.assignment;

public class A {
	int i;
	void initialize(int i)
	{
		i=20;
		System.out.println(i);
		
	}
	public static void main(String[] args) {
		A obj=new A();
		System.out.println(obj.i);
		obj.initialize(obj.i);
	}

}
