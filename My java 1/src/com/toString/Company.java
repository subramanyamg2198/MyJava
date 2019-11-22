package com.toString;

public class Company {
	public static void main(String[] args) {
		
		TestEngineer t1=new TestEngineer(1,"asdf",10.0,"bugzilla");
		TestEngineer t2=new TestEngineer(1,"asdf",10.0,"bugzilla");
		Developer d1=new Developer(1,"asdf",10.0,"java");
		Developer d2=new Developer(1,"asdf",10.0,"java");
	     System.out.println(t1);
	     System.out.println(t2);
	     System.out.println(t1.equals(t2));
	     System.out.println(t2.equals(t1));
	     System.out.println(t1.hashCode());
	     System.out.println(t2.hashCode());
	     System.out.println(d1.hashCode());
	     System.out.println(d2.hashCode());
	}

}