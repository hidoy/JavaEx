package com.javaex.oop.point.v4;

//	v4.상속 연습
public class Point {
	// 필드 (자식에게 허용)
	protected int x=0,y=0;
	public Point() {}
	public Point(int theX,int theY) {
		x=theX;
		y=theY;
	}
	public int getX() {
		return x;
	}
	public void setX(int theX){
		x=theX;
	}
	public int getY() {
		return y;
	}
	public void setY(int theY){
		y=theY;
	}
	
	// 일반 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다 %n",x,y);
	}
	// 메서드 오버로딩
	//		boolean bDraw -> true면 그렸습니다. -> false면 지웠습니다.
	public void draw(boolean bDraw) {
		String message = String.format("점 [x=%d], [y=%d]을",x,y);
		message +=bDraw ? "그렸습니다" : "지웠습니다";
		System.out.println(message);
	}
}
