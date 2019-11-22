package com.equals;

public class A1 {
int i;
double j;
A1(){}
A1(int i,double j)
{
this.i=i;
this.j=j;
}
public boolean equals(Object ob)
{
A1 temp=(A1) ob;
return this.i==temp.i && this.j==temp.j;
}
}
