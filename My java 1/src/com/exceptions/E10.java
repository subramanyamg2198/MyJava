package com.exceptions;

public class E10 {
	
	public static void main(String[] args)throws ClassNotFoundException {
		System.out.println("main started");
		Class.forName("java.util.Sanner");
		System.out.println("main ended");
		}
	}