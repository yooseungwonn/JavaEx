package com.javaex.ex05;



public class PrintApp {

	public static void main(String[] args) {
		Print integar = new Print();
		Print bool = new Print();
		Print floa = new Print();
		Print name = new Print();
		integar.integar = 10;
		
		bool.bool = "true";
		
		floa.floa = 5.7;
		
		name.name= "홍길동";
		
		
		
		
		// 상품 정보 출력
		System.out.printf("%d%n", integar.integar);
		System.out.printf("%s%n", bool.bool);
		System.out.printf("%.1f%n", floa.floa);
		System.out.printf("%s%n", name.name);

	}

}
