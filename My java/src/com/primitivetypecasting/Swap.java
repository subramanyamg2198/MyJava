package com.primitivetypecasting;
import java.util.Scanner;
public class Swap 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
   int n3=n1;
	n1=n2;
	n2=n3;
	System.out.println("Value after swapping ");
	System.out.println("first number " + n1);
	System.out.println("Second Number " + n2);
	
	
}
}
