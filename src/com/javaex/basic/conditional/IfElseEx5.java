package com.javaex.basic.conditional;
import java.util.Scanner;

public class IfElseEx5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score;
		score=scanner.nextInt();
		score=score/10;
		switch(score) {
		case 10 :
			System.out.println("A등급");
			break;
		case 9 :
			System.out.println("A등급");
			break;
		case 8 :
			System.out.println("B등급");
			break;
		case 7 :
			System.out.println("C등급");
			break;
		case 6 :
			System.out.println("D등급");
			break;
		default :
			System.out.println("F등급");
			break;
		}
		
		
		scanner.close();
	}
	
}
