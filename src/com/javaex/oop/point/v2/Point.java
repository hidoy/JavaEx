package com.javaex.oop.point.v2;

public class Point {
	private int x=0,y=0;
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
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다 %n",x,y);
	}
}
