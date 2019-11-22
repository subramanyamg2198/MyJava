package com.primitivetypecasting;
import java.util.Scanner;
public class Reversearray 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the initial point and size");
	int n=sc.nextInt();
	int size=sc.nextInt();
	int[] a=new int[size];
	for(int i=0;i<a.length;n++)
	{
		a[i++]=n;
	}
	
	for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	int[] b=new int[size];
	for(int i=a.length-1,j=0;i>=0;i--,j++)
	{
	b[j]=a[i];	
	}
	for(int j=0;j<b.length;j++)
	System.out.println(b[j]);
	
	}
	
		
		
}