package com.av.mediaitem;

import com.av.item.Item;

public abstract class MediaItem extends Item{
	private int runtime;

	public MediaItem(long uID, String title, int no_of_copies, int runtime) {
		super(uID, title, no_of_copies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}
	

}
