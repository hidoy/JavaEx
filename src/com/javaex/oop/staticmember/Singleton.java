package com.javaex.oop.staticmember;

// static 영역 활용
// 단 하나의 인스턴스만 유지
//		new Singleton() -> X
public class Singleton {
	private static Singleton instance = new Singleton();
	private Singleton(){
		// new 생성 불가
	}
	public static Singleton getIntance() {
		// 유일한 인스턴스 반환
		return instance;
	}
}
