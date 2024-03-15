package com.javaex.basic.operators;

public class CondOperEx {
	public static void main(String[] args) {
		int a=10;
		
		// 만약 a 짝수면 짝수 홀수면 홀수를 출력
		String result = a%2==0?"짝수":"홀수";
		// a%2==0?System.out,println("짝수"):System.out.println("홀수");
		System.out.println(a + "는 " + result + "입니다");
		
		int score = 70;
		String message;
		message = score>=80?"Good":score>50?"Pass":"Fail";
		System.out.println(message);
	}
}
