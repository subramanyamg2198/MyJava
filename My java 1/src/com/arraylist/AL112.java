package com.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
public class AL112 {
ArrayList<Integer> al=new ArrayList();
al.add(10);
al.add(20);
al.add(30);
Iterator <Integer> t=al.iterator();
while(t.hasNext())
{
Integer ob=t.next();
System.out.println(ob);
}
}
}
