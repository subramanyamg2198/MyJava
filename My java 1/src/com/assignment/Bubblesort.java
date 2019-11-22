package com.assignment;

import java.util.Scanner;
class Bubblesort 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int []a=new int [size];
		int swap;
		for(int i=0;i<a.length;i++)
		{
		System.out.println("Enter the numbers "+i);
		a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				swap=a[j];
				a[j]=a[j+1];
				a[j+1]=swap;
			}
		}
	}
		System.out.println("The elements after sorting");
			for(int i=0;i<a.length;i++) 
			{
			System.out.println(a[i]);
}
	}
}

		
		
		
		


	

