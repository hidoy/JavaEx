package com.javaex.basic.loop;
import java.util.Scanner;

public class LoopEx {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num;
		int i=1;
		num=scanner.nextInt();
		while(i<=9) {
			System.out.println(num +"*"+ i +" = "+num*i);
			i++;
		}
		
		scanner.close();
	}
}
