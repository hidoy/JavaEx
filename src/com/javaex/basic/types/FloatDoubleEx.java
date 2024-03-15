package com.javaex.basic.types;

public class FloatDoubleEx {
	public static void main(String[] args) {
		float floatVar, floatVar2;
		double doubleVar, doubleVar2;
		// 정밀도 채크
		floatVar=0.12345678901234567890F;	//float 뒤에 F 
		doubleVar= 0.12345678901234567890;
		
		System.out.println("float: " + floatVar);
		System.out.println("double: " + doubleVar);
		
		int intVar;
		intVar = 30000000;
		floatVar = 3E7F;
		doubleVar = 3E-9;
		System.out.println("int: " + intVar);
		System.out.println("float: " + floatVar);
		System.out.println("double: " + doubleVar);
		
		// 부동소수점 계산의 유의점
		//float , double 같은 경우 정밀도 포기하고 표현 범위만 넓힌 데이터
		System.out.println(0.1 * 3);
	}
}
