package com.throw1;

public class Emp {
static void salary(double salary)
{
if (salary>1000)

	System.out.println("Thank you");
	else
		throw new ArithmeticException();

}
public static void main(String[] args) {
	System.out.println("main started");
	salary(1029);
	System.out.println("main ended");
}
}
