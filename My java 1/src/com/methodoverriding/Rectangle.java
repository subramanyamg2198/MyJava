package com.methodoverriding;

public class Rectangle extends Shape {
	void area()
	{
		int l=12;
		int b=13;
		double area=l*b;
		System.out.println(area);
	}

}
