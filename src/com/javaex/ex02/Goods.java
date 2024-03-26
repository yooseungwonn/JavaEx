package com.javaex.ex02;

public class Goods {
	private String name;  // 상품명
	private int price;    // 가격
	
	public Goods(String name) {
		this.name = name;
		System.out.println("name 필드 초기화 생성자");
	}
	// 전체 필드 생성자
	public Goods(String name, int price) {
		// 객체 초기화를 담당
		this(name); // -> Goods(String name) 생성자 호출
		this.price = price;
		System.out.println("전체 필드 초기화 생성자");
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
	
	
	
	// 일반 메서드
	public void showInfo() {
		System.out.println("상품명: " + name + ", 가격: " + price);
	}
	System.out.println("상품명: 머그컵  가격: 2000");
	

}
