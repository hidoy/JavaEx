package com.javaex.oop.point.v4;

public class PointApp {
	public static void main(String[] args) {
		Point a=new Point(5,5);
		Point b=new Point(10,23);
//		a.setX(5);
//		a.setY(5);
//		b.setX(10);
//		b.setY(23);
		a.draw();
		b.draw();
		
		//	 오버로딩된 메서드 호출
		a.draw(true);
		a.draw(false);
		
		ColorPoint cp=new ColorPoint("red");
		
		cp.draw();
		ColorPoint cp2=new ColorPoint(10,10,"blue");
		cp2.draw();
		cp.draw(true);
		cp2.draw(false);
	}
}
