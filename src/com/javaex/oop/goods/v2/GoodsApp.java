package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		Goods laptop = new Goods();
		Goods cup = new Goods();
		camera.setName("nikon");
		camera.setPrice(400_000);
		laptop.setName("LG그램");
		laptop.setPrice(900_000);
		cup.setName("머그컵");
		cup.setPrice(2_000);
		
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
