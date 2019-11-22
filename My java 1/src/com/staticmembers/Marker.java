package com.staticmembers;   	

class Marker 
{
	static int price;
	static String color;
	static void writing()
	{
		System.out.println("Marker of color "+color+" price "+price);
		
	}
public static void main(String[] args) 
{
	System.out.println(Marker.price);
	System.out.println(Marker.color);
	Marker.price=100;
	Marker.color="black";
	Marker.price=80;
	Marker.color="blue";
	System.out.println(price);
	System.out.println(color);
	Marker.writing();
}
}
