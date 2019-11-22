package com.polymorphism;

public class Mainclass2 {
public static void main(String[] args) {
	Bank bank;
	bank=new ICICI();
	System.out.println(bank.ROI());
	bank=new Canara();
	System.out.println(bank.ROI());
	bank=new SBI();
	System.out.println(bank.ROI());
	bank=new SBIintouch();
	System.out.println(bank.ROI());
}
}
