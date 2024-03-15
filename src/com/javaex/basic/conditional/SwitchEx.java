package com.javaex.basic.conditional;
import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int room;
		room=scanner.nextInt();
		switch(room) {
			case 1 :
				System.out.println("R101호 입니다");
				break;
			case 2 :
				System.out.println("R202호 입니다");
				break;
			case 3 :
				System.out.println("R303호 입니다");
				break;
			case 4 :
				System.out.println("R404호 입니다");
			default :
				System.out.println("상담원에게 문의해주세요");
				break;
		}
		
		scanner.close();
	}
}
