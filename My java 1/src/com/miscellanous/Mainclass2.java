package com.miscellanous;

public class Mainclass2 {
	public static void main(String[] args) {
		B ob=B.createObject();
		ob.initialize(10);
		System.out.println("**********");
		B obj=B.createObject();
		obj.initialize(10);
		B.createObject().initialize(10);
	}

}
