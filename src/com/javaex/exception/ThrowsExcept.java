package com.javaex.exception;

import java.io.IOException;

public class ThrowsExcept {
	public void executeExcept() throws IOException{
		System.out.println("강제 예외 발생");
		throw new IOException(); // 강제로 예외 발생
	}
	public void executeRuntimeException(){
		// 런타임 익셉션 -> 샐행 타입에서만 확인되는 메서드
		// 예외 처리 없이도 컴파일은 되지만
		// 예외처리를 거쳐야 안정성 보장
		// throws 를 명시하지 않는다
		System.out.println("런타임 익셉션");
		throw new RuntimeException("런타임 익셉션");
	}
}
