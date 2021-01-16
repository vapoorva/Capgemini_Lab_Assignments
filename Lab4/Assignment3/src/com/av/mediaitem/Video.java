package com.av.mediaitem;

public class Video extends MediaItem{
	private String director;
	private String genre;
	private int year;
	
	public Video(long uID, String title, int no_of_copies, int runtime, String director, String genre, int year) {
		super(uID, title, no_of_copies, runtime);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", year=" + year + ", Runtime=" + getRuntime()
				+ ", UID" + getUID() + ", Title=" + getTitle() + ", No_of_copies=" + getNo_of_copies()
				+ "]";
	}

	
	

}
