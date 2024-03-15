package com.javaex.basic.console;

public class ConsoleOutputEx {
	public static void main(String[] args) {
		// System.out.printf : 형식 지정 문자열 출력
		System.out.println("안녕");
		System.out.print("안녕");
		System.out.printf("안녕");
		
		String str1 = "Hello";
		String str2 = "Java";
		
		System.out.println(str1 + " " + str2);
		
		// 이스케이프 문자
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		System.out.println("Hello, \"Java\"");
		System.out.println("Hello \\Java");
		
		String path = "C:\\Users\\Hong\\Memo.text";
		System.out.println(path);
	}
}
