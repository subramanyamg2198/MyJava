package com.nonprimitvearray;

public class Bookshelf {
	public static void main(String[] args) {
		Book b1=new Book ("Science",250);
		Book b2=new Book ("Mathematics",350);
		Book b3=new Book ("Social Science",300);
		Book b4=new Book ("Kannada",150);
		Book b5=new Book ("English",250);
		Book []arr= {b1,b2,b3,b4,b5};
		for(Book ob:arr)
		{
		System.out.println("Book name "+ob.name+" Book price "+ob.price+" Book isbn "+ob.isbn);
		ob.genre("Acadamics");
	}

	}
}
