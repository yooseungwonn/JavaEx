package com.javaex.ex02;

public class Goods {
	protected String name;  // 상품명
	protected int price;    // 가격
	
		
	public Goods(String name, int price) {		
		this.name = name; 
		this.price = price;
		
	}
	public Goods() {
		name = "null";
		price = 0;
	}
	
	
	public String getName() {		
		return name;
	}
	
	
	protected void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	protected void setPrice(int price) {
		this.price = price;
	}
	
	
		
	
	public void showInfo() {
		System.out.println("상품명: " + name + ", 가격: " + price);
	}
	
	

}
