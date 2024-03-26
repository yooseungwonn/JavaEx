package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		
		Point r1 = new Point();
		Point r2 = new Point();
		
		r1.setX(5);
		r1.setY(5);
		
		r2.setX(10);
		r2.setY(23);
		

		
		r1.draw();
		r2.draw();
		
		// 오버로딩된 메서드 호출
		r1.draw(true); //그리기
		r1.draw(false); //지우기ㅏ

	}

}
