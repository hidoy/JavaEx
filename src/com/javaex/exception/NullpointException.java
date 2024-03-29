package com.javaex.exception;

public class NullpointException {
	public static void main(String[] args) {
		String str=new String("hello");
		str=null;
		
		try { // 예외 발생 가능영역
			System.out.println(str.toString());
		}
		catch(NullPointerException e) {
			System.err.println("null 인 배열입니다");
		}
		finally {
			System.out.println("예외 처리 종료");
		}
	}
}
