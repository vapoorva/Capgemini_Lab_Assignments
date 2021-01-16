package com.av.writtenitem;

import com.av.item.Item;

public abstract class Written_Item extends Item{

	private String Author;
	public Written_Item(long uID, String title, int no_of_copies,String Author) {
		super(uID, title, no_of_copies);
		this.Author = Author;
		
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	@Override
	public String toString() {
		return "Written_Item [Author=" + Author + ", getUID()=" + getUID() + ", getTitle()=" + getTitle()
				+ ", getNo_of_copies()=" + getNo_of_copies() + "]";
	}

}
