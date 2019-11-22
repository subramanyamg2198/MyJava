package com.throw1;

public class Voter {
int age;
Voter(int age)
{
this.age=age;	

if(age>=18)
	System.out.println(this.age);
else
	throw new Userdefined();
}
public static void main(String[] args) {
	Voter ob=new Voter(18);
	
	
}}

