package com.primitivetypecasting;
import java.util.Scanner;
public class Primearray 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting point and number of elements");
		int n=sc.nextInt();
		int size=sc.nextInt();
				int[]a=new int[size];
						for(int i=0;i<a.length;n++)
						{
							if(m1(n))
								a[i++]=n;

						}
						for(int i=0;i<a.length;i++)
						{
							System.out.println(a[i]);
							
						}
						
	}
	public static boolean m1(int n)
	{int count=2;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				count++;
		}
		return(count==2);
	}
	
}

