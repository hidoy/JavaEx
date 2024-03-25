package com.javaex.oop.song.v2;

public class SongApp {
	public static void main(String[] args) {
		Song a=new Song("Real","아이유","이민수","좋은 날",3,10);
		Song b=new Song("Always","BIGBANG","G-DRAGON","거짓말",2,2007);
		Song c=new Song("버스커버스커","버스커버스커","장범준","벚꽃엔딩",4,2012);
//		a.setAlbum("Real");
//		a.setArtist("아이유");
//		a.setComposer("이민수");
//		a.setTitle("좋은 날");
//		a.setTrack(3);
//		a.setYear(2010);
//		b.setAlbum("Always");
//		b.setArtist("BIGBANG");
//		b.setComposer("G-DRAGON");
//		b.setTitle("거짓말");
//		b.setTrack(2);
//		b.setYear(2007);
//		c.setAlbum("버스커버스커");
//		c.setArtist("버스커버스커");
//		c.setComposer("장범준");
//		c.setTitle("벚꽃엔딩");
//		c.setTrack(4);
//		c.setYear(2012);
		
		a.showInfo();
		b.showInfo();
		c.showInfo();
	}
}
