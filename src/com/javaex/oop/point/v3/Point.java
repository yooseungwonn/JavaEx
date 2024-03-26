package com.javaex.oop.point.v3;

// v3. 메서드 오버로딩
// 매서드 시그니처 : 반환 타입, 이름은 같고
// 매개 변수의 타입, 순서, 개수만 다른 매서드
public class Point {
	// 필드 (은닉)
	private int x; 
	private int y;
	
	// getters/setters
	public int getX() {
		return x;
	}
	public void setX(int x) {		
		this.x = x;
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {		
		this.y = y;
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
