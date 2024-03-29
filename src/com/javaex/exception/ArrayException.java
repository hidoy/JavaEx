package com.javaex.exception;


public class ArrayException {
	public static void main(String[] args) {
		int[] intArray=new int[] {3,6,9};
		
		try {
			System.out.println(intArray[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("없는 배열 칸입니다");
		}
		finally {
			System.out.println("예외 처리 종료");
		}
	}
}
