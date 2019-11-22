package com.assignment;

public class Homeloan extends Loan {
	int id;
	Homeloan(double ROI,int id)
	{
	super(ROI);
	this.id=id;
	}
	public static void main(String[] args) {
		Homeloan ob1=new Homeloan(12,123);
		Homeloan ob2=new Homeloan(13,124);
		Homeloan ob3=new Homeloan(14,125);
		Homeloan ob4=new Homeloan(15,126);
		System.out.println("for id "+ob1.id+" return of interest is "+ob1.ROI);
		System.out.println("for id "+ob2.id+" return of interest is "+ob2.ROI);
		System.out.println("for id "+ob3.id+" return of interest is "+ob3.ROI);
		System.out.println("for id "+ob4.id+" return of interest is "+ob4.ROI);
	}


}
