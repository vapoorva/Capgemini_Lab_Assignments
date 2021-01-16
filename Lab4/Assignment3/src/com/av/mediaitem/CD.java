package com.av.mediaitem;

public class CD extends MediaItem{

	private String artist;
	private String genre;
	
	public CD(long uID, String title, int no_of_copies, int runtime, String artist, String genre) {
		super(uID, title, no_of_copies, runtime);
		this.artist = artist;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + ", UID: " + getUID() + ", Title: " + getTitle()
				+ ", No_of_copies : " + getNo_of_copies() + "]";
	}
	
	
}
