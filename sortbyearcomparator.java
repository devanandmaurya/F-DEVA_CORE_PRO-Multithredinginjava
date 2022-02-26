package com.song.mycomparator;

import java.util.Comparator;

import com.song.api.Song;

public class sortbyearcomparator implements Comparator<Song> {

	@Override
	public int compare(Song song, Song anothersong) {

		//sort all the song based on the year.
		if(song.getYear()>anothersong.getYear())
			
		{
			return +1;
		}
if(song.getYear()<anothersong.getYear())
			
		{
			return -1;
		}
		return 0;
	}


}
