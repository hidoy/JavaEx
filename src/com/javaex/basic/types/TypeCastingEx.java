package com.javaex.basic.types;

public class TypeCastingEx {
	public static void main(String[] args) {
		// 암시적 캐스팅
		int num=2;
		double num2=1.2;
		double num3=num*num2;
		System.out.println(num3);
		promotionEx();
	}
	public static void promotionEx() {
		//명시적 캐스팅
		int num=9099090;
		byte c1= (byte) num;
		int num2= 10;
		byte c2= (byte) num2;
		double num4=c1*c2;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(num4);
		
		char ch = 'A';
		short s2=(short)ch;
		System.out.println(c2);
	}
}
