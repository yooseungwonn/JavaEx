package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
		
		//Goods camera = new Goods();
		Goods camera = new Goods("nikon", 400_000);
	//	Goods laptop = new Goods();
	//	Goods cup = new Goods();
	//	camera.setName("nikon");
	//	camera.setPrice(400_000);
		Goods laptop = new Goods("LG그램", 900_000);
		Goods cup = new Goods("머그컵", 2_000);
		
		
		// 상품 정보 출력(getter 활용)
		System.out.printf("%s, %,d원%n", camera.getName(), camera.getPrice());
		System.out.printf("%s, %,d원%n", laptop.getName(), laptop.getPrice());
		System.out.printf("%s, %,d원%n", cup.getName(), cup.getPrice());
		
		// 상품 정보 출력(메서드 활용)
		camera.showInfo();
		laptop.showInfo();
		cup.showInfo();
		
	}

}
