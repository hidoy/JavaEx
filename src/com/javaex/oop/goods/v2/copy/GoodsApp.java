package com.javaex.oop.goods.v2.copy;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera=new Goods();
		
		camera.name="LG그램";
		camera.price=900000;
		
		Goods notebook=new Goods();
		
		// 상품 정보 출력
		System.out.printf("%s, %,d원%n", camera.name,camera.price);
		notebook.name="머그컵";
		notebook.price=2000;
		
		// 상품 정보 출력
		System.out.printf("%s, %,d원%n", notebook.name,notebook.price);
	}
}







