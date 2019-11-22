package com.nonprimitvearray;

import java.util.Scanner;
class ArrayEven {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=sc.nextInt();
	int []ar=new int[size];
	for(int i=0;i<ar.length;i++)
	{
		System.out.println("Enter the number to be stored in array"+i);
		ar[i]=sc.nextInt();
		
	}
	for(int x:ar)
	{
		System.out.println(x+1);
	}
	
	}}

