package com.javaex.basic.loop;
import java.util.Scanner;
public class LoopEx2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num;
		num=scanner.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(num + " * " + i+" = " + num*i);
		}
		
		scanner.close();
	}
}
