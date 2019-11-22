package com.assignment;

public class Engineer extends Emp {
	String tool;
	Engineer(int id,double sal,String name,String tool)
	{
		super(id , sal, name);
		this.tool=tool;
		
	}
	public static void main(String[] args) {
		Engineer ob1=new Engineer(1,20000,"abc","JIRA");
		Engineer ob2=new Engineer(2,25000,"abcd","BUGGINI");
		System.out.println("Engineer "+ob1.name+" of id "+ob1.id+" having salary "+ob1.sal+" is using "+ob1.tool+" tool");
		System.out.println("Engineer "+ob2.name+" of id "+ob2.id+" having salary "+ob2.sal+" is using "+ob2.tool+" tool  ");
	}

}
