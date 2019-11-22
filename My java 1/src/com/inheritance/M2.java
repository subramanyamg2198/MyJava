package com.inheritance;

public class M2 extends M1
{
int j;
{
System.out.println("from IIB of M2()");
}
M2()
{
super();
System.out.println("for P2()");
}
public static void main(String[] args) {
	M2 ob1=new M2();
	System.out.println(ob1.i);
	System.out.println(ob1.j);
	M1 ob2=new M1();
	ob2.i=20;
	System.out.println(ob2.i);
}
}
