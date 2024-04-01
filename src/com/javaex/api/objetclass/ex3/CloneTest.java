package com.javaex.api.objetclass.ex3;

public class CloneTest {

	public static void main(String[] args) {
		// 객체 생성
		Point p=new Point(10,20);
		System.out.println("p=" + p);
		
//		Point p2=p.clone(); // 복제
		
		// 객체 복제
		Point p2=p; // 참조 복제(주소만 복제)
		
		// 얕은 복제
		Point p3=p.getClone();
		
		System.out.println("p2=" + p2);	
		System.out.println("p3=" + p3);
		
		p.setX(30);
		p.setY(100);
		
		System.out.println("p=" + p);
		System.out.println("p2=" + p2);	
		System.out.println("p3=" + p3);
		
	}

}
