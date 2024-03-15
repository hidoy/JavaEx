package com.javaex.basic.operators;

public class BitOperEx {
	public static void main(String[] args) {
		// 비트연산자
		// bitOperTest(); 
		// 비트 시프트 연산자
		bitShiftTest();
		
	}
	public static void bitOperTest() {
		// 비트 연산자
		byte b1=0b1101;
		byte b2=0b0111;
		
		int result = b1&b2; // 비트 논리곱
		System.out.println(Integer.toBinaryString(result));
		result = b1 | b2;	// 비트 논리합
		System.out.println(Integer.toBinaryString(result));
		result = b1 ^ b2;	// 비트 논리합
		System.out.println(Integer.toBinaryString(result));
		System.out.println(Integer.toBinaryString(~result));
		System.out.println(~result);
	}
	public static void bitShiftTest() {
		int val=3;
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val << 30));
		System.out.println(val << 4);
	}
}
