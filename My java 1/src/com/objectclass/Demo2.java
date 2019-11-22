package com.objectclass;

public class Demo2 {
int i;
int j;
Demo2(int i,int j)
{
this.i=i;
this.j=j;
}
public String toString()
{
return ""+i+" "+j;	
}
public static void main(String[] args) {
	Demo2 ob=new Demo2(10,20);
	System.out.println(ob);
}
}

