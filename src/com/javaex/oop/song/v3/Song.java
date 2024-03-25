package com.javaex.oop.song.v3;

// v3 this 생성자

public class Song {
	private String title=new String();
	String artist=new String();
	String album=new String();
	String composer=new String();
	int year;
	int track;
	public Song(String title,String artist) {
		this.title=title;
		this.artist=artist;
	}
	public Song (String title,String artist,String theAlbum,String theComposer,int theYear,int theTrack) {
		this(title,artist);
		album=theAlbum;
		composer=theComposer;
		year=theYear;
		track=theTrack;
	}
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
		System.out.printf("%s, %s(%s, %d,%d track, %s) %n", artist,title,album,year,track,composer);
	}
}
