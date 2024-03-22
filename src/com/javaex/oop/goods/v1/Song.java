package com.javaex.oop.goods.v1;

public class Song {
	String title=new String();
	String artist=new String();
	String album=new String();
	String composer=new String();
	int year;
	int track;
	public String getTitle() {
		return title;
	}
	public void setTitle(String theTitle) {
		title=theTitle;
	}
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String theArtist) {
		artist=theArtist;
	}
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String theAlbum) {
		album=theAlbum;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String theComposer) {
		composer=theComposer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int theYear) {
		year=theYear;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int theTrack) {
		track=theTrack;
	}
	public void showInfo() {
		System.out.printf("%s, %s(%s, %d,%d track, %s) s %n", artist,title,album,year,track,composer);
	}
}
