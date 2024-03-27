package com.javaex.oop.point.v4;

//	상속 extends
public class ColorPoint extends Point{
	private String color;
	
	// 생성자 기본생성자가 없으면 자바가 기본생성자를 추가해서 compile 한다
	// 부모 생성자를 호출하지 않으면 기본 부모 생성자를 호출한다
	public ColorPoint(String theColor) {
		// 생성자 내에서 부모 생성자를 호출하지 않으면 부모의 기본 생성자를 호출
		super(0,0);
		color=theColor;
	}
	
	public ColorPoint(int x,int y,String color) {
		super(x,y);
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
//	public void draw() {
//		// getter 이용 우회접근
//		System.out.printf("점[x=%d, y=%d] %s을 그렸습니다 %n",super.getX(),super.getY(),color);
//	}
	@Override	// 	현재 메서드가 Override인지 확인
	public void draw() {
		// getter 이용 우회접근
		System.out.printf("점[x=%d, y=%d] %s을 그렸습니다 %n",x,y,color);
	}
	@Override
	public void draw(boolean bDraw) {
		String message = String.format("점 [x=%d], [y=%d] %s을",x,y,color);
		message +=bDraw ? "그렸습니다" : "지웠습니다";
		System.out.println(message);
	}
}
