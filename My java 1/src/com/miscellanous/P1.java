package com.miscellanous;

public class P1 {
	static void display(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}	
	}
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8};
		P1.display(a);
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]+1;
		}
		P1.display(a);
	}

}
