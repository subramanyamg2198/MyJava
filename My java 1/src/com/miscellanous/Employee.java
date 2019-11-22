package com.miscellanous;

public class Employee {
	int id;
	String name;
	int sal;
	Employee(String name,int id,int sal)
	{
	this.name=name;
	this.id=id;
	this.sal=sal;// TODO Auto-generated constructor stub
	}
	static Employee create(String name,int id,int sal)
	{
		return new Employee(name,id,sal);
		
		
	}
Employee initialize(int sal)
{
this.sal=sal;
return this;
}
Employee display()
{
System.out.println("Employee details:");
System.out.println("-------------------");
System.out.println("Employee id is:"+ id);
System.out.println("Employee name is:"+name);
System.out.println("Employee salary is:"+sal);
System.out.println("________________________");

return this;
}
public static void main(String[] args) {
	Employee.create("abcd",1,20000);
	Employee.create("abcd",1,20000).display();
	Employee.create("abcdef",2,30000).initialize(30000).display();
	
}

}