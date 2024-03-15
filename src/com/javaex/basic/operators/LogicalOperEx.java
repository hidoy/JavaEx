package com.javaex.basic.operators;

public class LogicalOperEx {
	public static void main(String[] args) {
		int a=7;
		int b=3;
		
		// 비교 연산자 : >=, <= ,> ,< ,== ,!=
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		// 논리 연산자
		int c=11;
	
		boolean r1= c<=0;
		boolean r2= c>=10;
		boolean result= r1 | r2;
		System.out.println("c 는 0이하 또는 10이상이라는 사실은 :" + result);
		System.out.println("c 는 0이하 또는 10이상이라는 사실은 :" + result);
		System.out.println("");
	}
}
