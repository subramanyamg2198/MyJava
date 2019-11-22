package com.hasa;

public class Road {
public static void main(String[] args) {
	BIke bike1=new BIke(45.0,"red");
	BIke bike2=new BIke(50.0,"black");
	BIke bike3=new BIke(55,"grey");
	System.out.println(bike1.color);
	System.out.println(bike1.mileage);
	System.out.println(bike1.e.cc);
	System.out.println(bike2.color);
	System.out.println(bike2.mileage);
	System.out.println(bike2.e.cc);
	System.out.println(bike3.color);
	System.out.println(bike3.mileage);
	System.out.println(bike3.e.cc);
}
}
