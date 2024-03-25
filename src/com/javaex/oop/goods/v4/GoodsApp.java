package com.javaex.oop.goods.v4;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera=new Goods("카메라",900000);
		
	//	camera.setName("카메라");
	//	camera.setPrice(9000000);
		
		Goods notebook=new Goods("머그컵",2000);
		
		// 상품 정보 출력
//		notebook.setName("머그컵");
//		notebook.setPrice(2000);
//		
		// 상품 정보 출력
		camera.showInfo();
		notebook.showInfo();
	}
}







