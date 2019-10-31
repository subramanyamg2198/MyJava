package com.primitivetypecasting;
import java.util.Scanner;
public class Demo5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number");
		int n=sc.nextInt();
		System.out.println("Enter the number of variables to store");
		int size=sc.nextInt();
		int[] a =new int[size];
		for(int i=0;i<a.length;n++)
		{
			if(n%2==0)
			{
			a[i++]=n;
			}
		}
			System.out.println("array is:");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
		}

		
	}
}


