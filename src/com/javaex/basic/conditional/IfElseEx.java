package com.javaex.basic.conditional;
import java.util.Scanner;

public class IfElseEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score;
		score = scanner.nextInt();
		if(score>=60) {
			System.out.println("합격입니다");
		}
		else {
			System.out.println("불합격입니다");
		}
		scanner.close();
	}
}
