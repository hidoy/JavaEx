package com.javaex.oop.shape.v1;

public class Rectangle extends Shape{
	private int width,height;
	public Rectangle(int x,int y,int width,int height) {
		super(x,y);
		this.width=width;
		this.height=height;
	}
	
	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, width=%d, height=%d, area=%f] 을 그렸어요.%n",super.x,super.y,width,height,area());
	}
	
	@Override
	public double area() {
		double area=width*height;
		return area;
	}
}
