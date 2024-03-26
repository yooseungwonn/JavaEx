package com.javaex.oop.song.v3;
// 필드, getter/setter, 일반 메서드
public class SongApp {

	public static void main(String[] args) {
		Song iu = new Song("아이유", "좋은날","Real", "이민수", 2010, 3);
		Song bigbang = new Song("BIGBANG", "거짓말","Always", "G_dragon", 2007, 2);
		Song busker = new Song("버스커버스커", "벚꽃엔딩","버스커버스커1집", "장범준", 2012, 4);
			
		iu.showInfo();
		bigbang.showInfo();
		busker.showInfo();
		

	}

}
