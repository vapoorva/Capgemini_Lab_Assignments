package com.av.writtenitem;

public class JournalPaper extends Written_Item {
	
	private int year_of_publish;
	
	public JournalPaper(long uID, String title, int no_of_copies, String Author, int yop) {
		super(uID, title, no_of_copies, Author);
		this.year_of_publish = yop;
	}

	@Override
	public String toString() {
		return "JournalPaper [year_of_publish : " + year_of_publish + ", Author : " + getAuthor() + ", UID :"
				+ getUID() + ", Title:" + getTitle() + ", No_of_copies: " + getNo_of_copies() + "]";
	}

	
}
