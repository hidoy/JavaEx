package com.javaex.api.objetclass.rectangle;

public class Rectangle {
	private int x;
	private int y;
	public Rectangle(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle other = (Rectangle) obj; // 형변환
			return (x*y) == (other.x)*(other.y); // 필드 값 비교
		}
	    return super.equals(obj);
	}
}
