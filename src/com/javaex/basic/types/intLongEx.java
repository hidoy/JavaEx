package com.javaex.basic.types;

public class intLongEx {
	public static void main(String[] args) {
		int intVar1;
		long longVar1;
		intVar1=2024;
		longVar1=1234567890123L;	//long형 데이터뒤에는 ㅣ
		System.out.println(intVar1);
		System.out.println(longVar1);
		
		long amount=10000000000000L;
		System.out.println(amount);
		
		int bin, oct, hex;
		bin = 0b1100;	// 2진수
		oct = 072;	//8진수
		hex = 0xFF;	//16진수
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
}
