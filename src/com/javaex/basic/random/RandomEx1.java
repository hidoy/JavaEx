package com.javaex.basic.random;

public class RandomEx1 {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			int num=(int)(Math.random()*45)+1;
			System.out.println(num);
		}
	}
}
