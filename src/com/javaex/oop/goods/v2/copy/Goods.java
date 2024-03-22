package com.javaex.oop.goods.v2.copy;

// v2. 필드
public class Goods {
	// 필드 선언
	private String name;	// 상품명
	private int price;		// 가격
	
	public String getName() {
		return name;
	}
	public void setName(String theName) {
		name=theName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int thePrice) {
		price=thePrice;
	}
	public void showInfo() {
		System.out.printf("%s, %,d원%n", name,price);
	}
}
