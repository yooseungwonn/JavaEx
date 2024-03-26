package com.javaex.ex02;

import com.javaex.oop.goods.v2.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		Goods cup = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		cup.showInfo();

	}

}
