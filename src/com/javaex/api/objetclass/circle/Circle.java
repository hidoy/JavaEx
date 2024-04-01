package com.javaex.api.objetclass.circle;

import com.javaex.api.objetclass.ex2.Point;

public class Circle {
	private int x;
	private int y;
	private int radius;
	public Circle(int x,int y,int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	

	  public boolean equals(Object obj) {
	        if(obj instanceof Circle) {
	        	Circle other = (Circle) obj; // 형변환
	        	return radius == other.radius; // 필드 값 비교
	        }
	        return super.equals(obj);
	    }
}
