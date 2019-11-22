package com.primitivetypecasting;
import java.util.Scanner;
public class Swap1 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 numbers");
int n1=sc.nextInt();
int n2=sc.nextInt();
n1=n1-n2;
n2=n1+n2;
n1=n2-n1;
System.out.println("The first number after swapping is "+n1);
System.out.println("The second number after swapping is "+n2);

}
}
