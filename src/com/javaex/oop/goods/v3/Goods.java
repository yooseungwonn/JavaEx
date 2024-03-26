package com.javaex.oop.goods.v3;

// v3. 생성자
public class Goods {
	// 필드 선언
	// instance 영역
	private String name;  // 상품명
	private int price;    // 가격
	
	// 생성자를 하나도 선언하지 않을 경우
	// 자바 컴파일러가 기본 생성자를 추가
	// 개발자가 생성자를 만들었을 경우,
	// 기본 생성자는 추가되지 않는다.
	
	// 생성자
	public Goods(String name, int price) {
		// 객체 초기화를 담당
		this.name = name;
		this.price = price;
	}
	// getter Setter
	// Setter가 없으면 Read Only 필드를 만들 수 있고
	// getter/setter 모두 없으면 프라이빗 필드가 된다
	public String getName() {
		// 메서드 영역
	return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getPrice() {
		return price;
	}
//	public void setPrice(int price) {
		// getter/setter를 활용하면 무결성 체크
		// 인증 체크 같은 로직을 수행 가능 
//		this.price = price;
//	}
	
	// 일반 메서드
	public void showInfo() {
		System.out.printf("상품이름: %s%n가격: %,d%n",name, price);
	}
}
