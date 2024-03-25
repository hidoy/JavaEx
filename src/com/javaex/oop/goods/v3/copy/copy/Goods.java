package com.javaex.oop.goods.v3.copy.copy;

// v2. 필드
public class Goods {
	// 필드 선언
	private String name;	// 상품명
	private int price;		// 가격
	
	//생성자를 하나도 선언하지 않을 경우
	// 자바 컴파일러가 기본 생성자를 추가
	// 하지마 생성자를 만들었을 경우
	// 기본 생성자는 추가되지 않는 다
	// 생성자
	public Goods(String theName, int thePrice) {
		// 객체 초기화를 담당
		name=theName;
		price=thePrice;
	} 
	
	public String getName() {
		return name;
	}
//	public void setName(String theName) {
//		name=theName;
//	}
	public int getPrice() {
		return price;
	}
//	public void setPrice(int thePrice) {
//		price=thePrice;
//	}
	public void showInfo() {
		System.out.printf("%s, %,d원%n", name,price);
	}
}
