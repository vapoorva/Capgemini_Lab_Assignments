package com.av.writtenitem;

public class Book extends Written_Item{

	public Book(long uID, String title, int no_of_copies, String Author) {
		super(uID, title, no_of_copies, Author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [Author: " + getAuthor() + ", UID: " + getUID() + ", Title: " + getTitle()
				+ ", No_of_copies: " + getNo_of_copies() + "]";
	}

	
}
