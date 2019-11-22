package com.nonprimitvearray;

 class Songlist {
	public static void main(String[] args) {
		Song [] playlist=new Song[3];
		playlist[0]=new Song("ABC","abc",1234);
		playlist[1]=new Song("ABCD","abcd",123);
		playlist[2]=new Song("ABCDE","abcde",134);
		
		for(Song ob: playlist)
	{
	System.out.println("name:"+ob.name);
	System.out.println("singer:"+ob.singer);
	System.out.println("likes:"+ob.likes);
	}
	}
		
		
	}


