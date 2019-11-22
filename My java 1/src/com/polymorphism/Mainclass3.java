package com.polymorphism;

public class Mainclass3 {
public static void main(String[] args) {
	{
		Bank[] b=new Bank[5];
		b[0]=new ICICI();
		b[1]=new Canara();
		b[2]=new SBI();
		b[3]=new SBIintouch();
		b[4]=new Bank();
		for(Bank bank:b)
		{
			System.out.println(bank.ROI());
		}
	}
}
}
