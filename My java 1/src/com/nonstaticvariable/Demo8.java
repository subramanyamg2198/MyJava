package com.nonstaticvariable;

public class Demo8 {
	int i=10;
	void test()
	{
		int i=20;
		System.out.println(i);
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		Demo8 ob=new Demo8();
		ob.test();
	}
}
