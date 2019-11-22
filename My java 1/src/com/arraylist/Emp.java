package com.arraylist;

public class Emp {
	String name;
	int id;
	Emp(){}
	public Emp(String name,int id) {
		super();
		this.name = name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	
	
}
