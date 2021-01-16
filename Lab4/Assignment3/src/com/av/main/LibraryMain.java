package com.av.main;

import com.av.mediaitem.CD;
import com.av.mediaitem.Video;
import com.av.writtenitem.Book;
import com.av.writtenitem.JournalPaper;

public class LibraryMain {

	public static void main(String[] args) {
		//Book created
		long book_Uid = System.currentTimeMillis();
		int book_copies =3;
		String book_Author = "Mac Gaw Hill";
		String book_title = "Java : The Complete Reference";
		Book book = new Book(book_Uid,book_title,book_copies,book_Author);
		System.out.println("Book added:"+ book);
		
		//Journal created
		long journal_Uid = System.currentTimeMillis();
		int journal_copies =4;
		String journal_Author = "Tesla";
		String journal_title = "Magentic Fields";
		int yop = 2016;
		JournalPaper journal = new JournalPaper(journal_Uid, journal_title, journal_copies, journal_Author, yop);
		System.out.println("Journal added:"+ journal);
		
		//CD created
		long cd_Uid = System.currentTimeMillis();
		int cd_copies =5;
		String cd_Artist = "Balguruswamy";
		String cd_title = "C++";
		int cd_runtime = 3;
		String cd_genre = "Technology";
		CD cd = new CD(cd_Uid, cd_title, cd_copies, cd_runtime, cd_Artist, cd_genre);
		System.out.println(cd);
		
		//Video created
		long video_Uid = System.currentTimeMillis();
		int video_copies =2;
		String video_Director = "Bear Grylls";
		String video_title = "Documentary";
		int video_runtime = 20;
		String video_genre = "Wildlife";
		int video_yop = 2017;
		Video video = new Video(video_Uid, video_title, video_copies, video_runtime, video_Director, video_genre, video_yop);
		System.out.println(video);
	}
}
