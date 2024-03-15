package com.javaex.basic.conditional;
import java.util.Scanner;

public class IfElseEx4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int subc;
		subc=scanner.nextInt();
		if(subc>=1 && subc<=4) {
			System.out.println("R"+subc+"0"+subc+"호 입니다.");
		}
		else{
			System.out.println("상담원에게 문의하세요");
		}
		scanner.close();
	}
}
