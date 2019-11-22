package com.assignment;

public class Smartphones extends Mobile{
	String version;
	Smartphones(String name,String model,double cost,String version)
	{
		super(name,model,cost);
		this.version=version;
	}
public static void main(String[] args) {
	Smartphones ob1=new Smartphones("Nokia","1100",2500,"null");
	Smartphones ob2=new Smartphones("Samsung","J2",7500,"lolipop");
	Smartphones ob3=new Smartphones("Honor","7C",9000,"oreo");
	System.out.println(ob1.name+" of model "+ob1.model+" costs "+ob1.cost+" of version "+ob1.version);
	System.out.println(ob2.name+" of model "+ob2.model+" costs "+ob2.cost+" of version "+ob2.version);
	System.out.println(ob3.name+" of model "+ob3.model+" costs "+ob3.cost+" of version "+ob3.version);
}
}
