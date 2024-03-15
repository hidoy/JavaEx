package com.javaex.basic.conditional;
import java.util.Scanner;

public class IfElseEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		num=scanner.nextInt();
		if(num>0) {
			System.out.println("양수");
			if(num%2==0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
		}
		else if(num<0){
			System.out.println("음수");
		}
		else {
			System.out.println("0입니다");
		}
		scanner.close();
	}	
}
