package com.javaex.api.objetclass.ex2;

// 두 객체의 내무 데이터 같음을 확인하는 equals메서드
public class Point {	// extends java.lang.Object
	// 필드 
	private int x;
	private int y;
	
	// 생성자
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	//equals: 두 객체의 내부 데이터가 같음을 확인하는 메서드
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			// 전달 받은 파라미터 other가 Point 인지 확인
			// obj -> Point 로 캐스팅
			Point other=(Point)obj;
			// 두 객체의 동등성
			// 두 객체의 x 필드가 같고, 두객체의 y 필드가 같아야 동등하다
			return x==other.x && y==other.y;
		}
		// obj가 Point가 아님
		return super.equals(obj);
	}
}
