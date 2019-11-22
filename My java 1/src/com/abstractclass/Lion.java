package com.abstractclass;

public class Lion extends Animal {
Lion(){}
Lion(double height,double weight)
{
super(height,weight);
}
@Override
void talk()
{
System.out.println("Roar");	
}
}
