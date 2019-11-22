package com.abstractclass;

public class Jungle {
public static void main(String[] args) {
	//Animal a=new Animal();
	Dog d=new Dog(10,20);
	Lion l=new Lion(30,80);
	System.out.println(d.height+" " + d.weight);
	System.out.println(l.height+" " + l.weight);
	l.talk();
	d.talk();
}
}
