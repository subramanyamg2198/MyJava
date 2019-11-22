package com.primitivetypecasting;
import java.util.Scanner;
public class Array 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers to store and size");
		int n=sc.nextInt();
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;n++)
		{
			if(n%2==0)
				a[i++]=n;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
