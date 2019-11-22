package com.arraylist;
import java.util.ArrayList;
class AL1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.add(10);
		al.add(20);
		al.add("Virat");//Heterogeneous allowed
		System.out.println(al);// order maintained
		al.add(1, "Dhoni");
		System.out.println(al);
		al.add("Kumble");
		al.add("Pandya");
		System.out.println(al.isEmpty());//false
		System.out.println(al.size());//6
		Object ob=al.set(5, "Dravid");
		System.out.println(ob);//Pandya
		System.out.println(al);System.out.println(al.contains("Suhas"));//false
		System.out.println(al.add(20));//true //duplicate allowed
		System.out.println(al);
		System.out.println(al.indexOf(20));//2
		System.out.println(al.lastIndexOf(20));//6
		System.out.println(al.indexOf("Kohli"));//-1
		System.out.println(al.size());
		System.out.println(al);
		al.clear();
		System.out.println(al.isEmpty());//true
		System.out.println(al.size());//0
		
	}

}
