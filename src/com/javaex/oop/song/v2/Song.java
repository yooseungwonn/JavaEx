package com.javaex.oop.song.v2;

// v2. 생성자
// 기본 생성자와 전체 필드 생성자
public class Song {
	// 필드 선언 
	private String title;  
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;	
	// getters/setters
	public Song(String title, String artist, String album, String composer, int year, int track) {
		// 객체 초기화를 담당
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;		
	}	
	public String getArtist() {
		return artist;
	}	
	public String getAlbum() {
		return album;
	}	
	public String getComposer() {
		return composer;
	}	
	public int getYear() {
		return year;
	}
	
	public int getTrack() {
		return track;
	}
	
	// 일반 메서드
	public void showInfo() {
		System.out.printf("%s, %s(%s, %d, %d번 track, %s 작곡)%n", artist, title, album, year, track, composer);
	}
}


