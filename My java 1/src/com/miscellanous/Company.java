package com.miscellanous;

public class Company {
	public static void main(String[] args) {
		Employee.create("ABC", 24, 20000);
		Employee.create("ABCD",25,25000).display();
		Employee.create("ABCDE",26,25000).initialize(30000).display();
		
	}

}
