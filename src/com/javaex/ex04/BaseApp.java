package com.javaex.ex04;

public class BaseApp {

	public static void main(String[] args) {
		Base noon = new Base();
		Base night = new Base();
		Base afternoon = new Base();
		noon.name = "낮에는 열심히 수업 듣자";
		
		night.name = "밤에는 수면";
		
		afternoon.name = "오후도 공부해야 합니다";
		
		
		// 상품 정보 출력
		System.out.printf("%s%n", noon.name);
		System.out.printf("%s%n", night.name);
		System.out.printf("%s%n", afternoon.name);

	}

}
