package com.arraylist;

public class Bike {
	String color;
	double mileage;
	Bike(){}
	Bike(String color,double mileage)
	{
		this.color=color;
		this.mileage=mileage;
	}
	@Override
	public String toString() {
		return "Bike [color=" + color + ", mileage=" + mileage + "]";
	}

}
