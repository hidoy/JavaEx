package com.javaex.api.objetclass.circle;

public class CircleApp {
	public static void main(String[] args) {
		Circle a=new Circle(6,4,10);
		Circle b=new Circle(2,12,10);
		Circle c=new Circle(2,12,10);
		Circle d=c;
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(d.equals(c));
	}
}
