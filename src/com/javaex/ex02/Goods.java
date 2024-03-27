package com.javaex.ex02;

public class Goods {
	private String name;  // 상품명
	private int price;    // 가격
	private String cupname;  // 상품명
	private int cupprice;
		
	public Goods(String name, int price, String cupname, int cupprice) {		
		this.name = name; 
		this.price = price;
		this.cupname = cupname; 
		this.cupprice = cupprice;
	}
	
	public String getName() {		
		return name;
	}
	
	public String getCupname() {		
		return cupname;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	private void setCupname(String cupname) {
		this.cupname = cupname;
	}

	public int getPrice() {
		return price;
	}
	public int getCupprice() {
		return cupprice;
	}
	
	private void setPrice(int price) {
		this.price = price;
	}
	private void setCupprice(int cupprice) {
		this.cupprice = cupprice;
	}
		
	
	public void showInfo() {
		System.out.println("상품명: " + name + ", 가격: " + price);
	}
	public void showInfo1() {
		System.out.println("상품명: " + cupname + ", 가격: " + cupprice);
	}
	
	

}
