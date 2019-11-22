package com.assignment;

public class Sandalwood extends Movie{
	Sandalwood(int rating,String name)
	{
		super(rating,name);
	}
	public static void main(String[] args) {
		Sandalwood ob1=new Sandalwood(5,"kgf");
		Sandalwood ob2=new Sandalwood(4,"pailwan");
		Sandalwood ob3=new Sandalwood(3,"yajamana");
		System.out.println(ob1.name+" is having rating "+ob1.rating);
		System.out.println(ob2.name+" is having rating "+ob2.rating);
		System.out.println(ob3.name+" is having rating "+ob3.rating);
	}

}
