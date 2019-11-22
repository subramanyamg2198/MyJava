package com.miscellanous;

public class D {
	int i;
	double j;
	boolean b;
	static D create()
	{
		return new D();
	}
D initialize(int i,double j,boolean b)
{
this.i=i;
this.j=j;
this.b=b;
return this;
}
D display()
{
System.out.println(this.i);	
System.out.println(this.j);	
System.out.println(this.b);
return this;

}
public static void main(String[] args) {
	D ob1=new D();
	ob1.initialize(10, 20.0, true);
	ob1.display();
	D.create().initialize(10,20.0,true).display();
}
}
