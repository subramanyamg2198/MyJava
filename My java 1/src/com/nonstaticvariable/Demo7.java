package com.nonstaticvariable;

public class Demo7 {
	int i;
	void test()
	{
		System.out.println(i);
		System.out.println(this.i);
	}
public static void main(String[] args) {
	Demo7 obj=new Demo7();
	System.out.println(obj.i);
	obj.test();
}
}
