package com.polymorphism;

public class Mainclass {
public static void main(String[] args) {
	A ob;
	ob=new A();
	ob.test();//from test of A()
	
	ob=new B();//upcasting
	ob.test();//polymorphism
	
	ob=new C();
	ob.test();
	
	ob=new B();
	ob.test();
}
}

