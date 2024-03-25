package com.javaex.oop.goods.v4;

// v4. this
// 현재 자기 자신의 객체를 의미
// this() : 현재 클래스 내부의 다른 생성자를 호출할 때 사용할 수 있다
public class Goods {
	// 필드 선언
	private String name;	// 상품명
	private int price;		// 가격
	
	// name 필드 생성자
	public Goods(String name) {
		this.name=name;
		System.out.println("name 필드 초기화 생성자");
	}
	// 전체 필드 생성자
	public Goods(String name, int thePrice) {
		// 객체 초기화를 담당
		this(name); // -> Goods(String name) 생성자 호출
		price=thePrice;
		System.out.println("전체 필드 초기화 생성자");
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
