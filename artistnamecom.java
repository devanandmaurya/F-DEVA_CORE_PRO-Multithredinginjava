package com.song.mycomparator;

import java.util.Comparator;

import com.song.api.Song;

public class artistnamecom  implements Comparator<Song>{

	@Override
	public int compare(Song s1, Song s2) {
		
		//if()
	//	return  s1.getArtist().compareTo(s2.getArtist()); //ascending order
		return - s1.getArtist().compareTo(s2.getArtist()); //descending order
		
	}

}
