package com.song;

import java.util.ArrayList;
import java.util.Collections;

import com.song.api.Song;
import com.song.mycomparator.artistnamecom;
import com.song.mycomparator.sortbyearcomparator;

import mutilitypackage.com.MyUtlil;

public class SongApp {

	public SongApp() {
	}
	public static void main(String[] args) {
		
	
ArrayList<Song> music=new ArrayList<>();

music.add(new Song ("Agar asma tak badal" ,"Amaer", 222));
music.add(new Song ("Ghar chhod ke na jao" ,"anand", 666));
music.add(new Song ("pyar dil me" ,"soni", 111));
MyUtlil.iteratelist(music);
sortbyearcomparator scd= new sortbyearcomparator();

Collections.sort(music ,scd); 

Collections.sort(music ,new sortbyearcomparator());
System.out.println("-------------------------------------------------------");
System.out.println("after sorting base on year ");
Collections.sort(music , new artistnamecom());
System.out.println("sorted by artist in desending order");
MyUtlil.iteratelist(music);
// by comparator interface your own logic of sorting . it is util pckg 
}
}