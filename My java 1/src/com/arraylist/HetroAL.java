package com.arraylist;
import java.util.ArrayList;
public class HetroAL {
public static void main(String[] args) {
	ArrayList hetro=new ArrayList();
	hetro.add(new Bike("Black",60));
	hetro.add(new Emp("Vishnu",1));
	Movie m=new Movie("GOOGLY",5);
	hetro.add(new Movie("KGF",5));
	hetro.add(m);
	hetro.add(10);//Integer object upcasted to Object type
	System.out.println(hetro);
	for(int i=0;i<hetro.size();i++)
	{
		Object x=hetro.get(i);
		if(x instanceof Bike)
		{
			System.out.println(((Bike)x).color);
			System.out.println(((Bike)x).mileage);
			
		}
		if (x instanceof Emp)
		{
		System.out.println(((Emp)x).name);
		System.out.println(((Emp)x).id);	
		}
		if(x instanceof Movie)
		{
			System.out.println(((Movie)x).name);
			System.out.println(((Movie)x).rating);
		}
		if(x instanceof Integer) 
		{
			System.out.println(((Integer)x)+10);
		}
	}
}
}
