package com.javaex.oop.point.v4;

// v4. 상속 연습
// 매서드 시그니처 : 반환 타입, 이름은 같고
// 매개 변수의 타입, 순서, 개수만 다른 매서드
public class Point {
	
	protected int x; 
	protected int y;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	// 필드 (은닉)
	
	
	public Point() {
		x=0;
		y=0;
	}
	public Point(int x, int y) {
		this.x= x;
		this.y =y;
	}
	
	
	// 일반 메서드
	public void draw() {
		System.out.printf("점 [x=%d, y=%d]을 그렸습니다.%n", x, y);
	}
	// 매서드 오버로딩
	// boolean bDraw -> true 면 그렸습니다 -> false면 지웠습니다
	public void draw(boolean bDraw) {
		String message = String.format("점 [x=%d, y=%d]을 ", x, y);
		message += bDraw ? "그렸습니다." : "지웠습니다.";
		System.out.println(message);
	}

}
