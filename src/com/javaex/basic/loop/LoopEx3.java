package com.javaex.basic.loop;
import java.util.Scanner;
public class LoopEx3 {
	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			if(i%2==0 || i%3==0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
