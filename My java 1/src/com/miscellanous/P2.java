package com.miscellanous;



public class P2 
{
	static void swap(int [] a,int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	static void display(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6};
		P2.display(a);
		P2.swap(a,0,5);
		P2.display(a);
		
	}
	

	

}
