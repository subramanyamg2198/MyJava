package com.staticmembers;

public class Demo9 
{
static
{
System.out.println("from sib-1");	

}
public static void main(String[] args) {
	System.out.println("from main");
}
static
{
System.out.println("from sib-2");	
}
}
