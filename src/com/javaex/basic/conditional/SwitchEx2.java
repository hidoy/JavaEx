package com.javaex.basic.conditional;
import java.util.Scanner;

public class SwitchEx2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int month;
		month=scanner.nextInt();
		switch(month){
			case 2 :
				System.out.println("28일");
				break;
			case 4 :
				System.out.println("30일");
				break;
			case 6 :
				System.out.println("30일");
				break;
			case 9 :
				System.out.println("30일");
				break;
			case 11 :
				System.out.println("30일");
				break;
			default :
				System.out.println("31일");
				break;
				
		}
		
		scanner.close();
	}
}
