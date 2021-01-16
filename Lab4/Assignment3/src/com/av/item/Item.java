package com.av.item;

public abstract class Item {

	private long UID;
	private String title;
	private int no_of_copies;
	
	
	public Item(long uID, String title, int no_of_copies) {
		super();
		UID = uID;
		this.title = title;
		this.no_of_copies = no_of_copies;
	}
	
	public long getUID() {
		return UID;
	}
	public void setUID(long uID) {
		UID = uID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNo_of_copies() {
		return no_of_copies;
	}
	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}

	@Override
	public String toString() {
		return "Item [UID=" + UID + ", title=" + title + ", no_of_copies=" + no_of_copies + "]";
	}
	
//	public abstract void checkIn();
//	public abstract void checkOut();
//	public abstract void addItem();
}
