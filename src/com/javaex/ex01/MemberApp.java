package com.javaex.ex01;



public class MemberApp {

	public static void main(String[] args) {
		Member jung = new Member();
		Member lee = new Member();
		Member yoo = new Member();
		
		jung.setId("jws");
		jung.setName("정우성");
		jung.setPoint(50000);
		
		
		lee.setId("lhr");
		lee.setName("이효리");
		lee.setPoint(40000);
		
		
		yoo.setId("yjs");
		yoo.setName("유재석");
		yoo.setPoint(30000);
	
		jung.showInfo();
		lee.showInfo();
		yoo.showInfo();
	}

}
