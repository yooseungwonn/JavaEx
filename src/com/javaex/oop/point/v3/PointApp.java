package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		
		Point r1 = new Point(5, 5);
		Point r2 = new Point(10, 23);
		
		

		
		r1.draw();
		r2.draw();
		
		// 오버로딩된 메서드 호출
		r1.draw(true); //그리기
		r1.draw(false); //지우기ㅏ

	}

}
