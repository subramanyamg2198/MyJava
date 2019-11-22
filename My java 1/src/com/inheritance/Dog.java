package com.inheritance;

public class Dog extends Animal {
	String color;
	String breed;
	Dog(){}
	Dog(int height,int weight,String color,String breed)
	{
		super(height,weight);
		this.color=color;
		this.breed=breed;
	}
	public static void main(String[] args) {
		Dog d1=new Dog(22,50,"Black","Retriever");
		Dog d2=new Dog(20,60,"White","Husky");
		Dog d3=new Dog(40,80,"Black","Great dane");
		System.out.println("Breed is "+d1.breed+ " Height is "+d1.height+" Weight is "+d1.weight+" Color is "+d1.color);
		System.out.println("____________________________________________________________________");
		System.out.println("Breed is "+d2.breed+ " Height is "+d2.height+" Weight is "+d2.weight+" Color is "+d2.color);
		System.out.println("____________________________________________________________________");
		System.out.println("Breed is "+d3.breed+ " Height is "+d3.height+" Weight is "+d3.weight+" Color is "+d3.color);
	}
}
