package com.javaex.basic.types;

public class ConstantEx {
	public static void main(String[] args) {
		// 상수 : 변하지 않는 수
		// 초기화 조회는 가능 하지만 재할당은 불가
		final double PI=3.141592; // 상수의 이름은 모두 대문자 , _ 로 구분
		final int SPEED_LIMIT = 110;
		boolean check;
		int CS;
		CS = 100;
		check = CS < SPEED_LIMIT;
		System.out.println(check);
		
		// 상수의 사용 목적
		//	1. 코드의 가독성을 높인다
		//	2. 특정 데이터를 한곳에서 일괄 관리한다
		//	3. 코드를 변경할 수 없다(불변성)
		
	}
}
