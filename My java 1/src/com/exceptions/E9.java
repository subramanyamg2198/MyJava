package com.exceptions;

public class E9 {
public static void main(String[] args) {
	System.out.println("main started");
	try
	{
	Class.forName("java.util.Sanner");
	}
	catch(ClassNotFoundException e)
	{
		System.out.println(e);
		e.printStackTrace();
	}
	System.out.println("main ended");
}
}
