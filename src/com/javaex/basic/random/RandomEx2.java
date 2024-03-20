package com.javaex.basic.random;

public class RandomEx2 {
	public static void main(String[] args) {
		int i=1;
		while(i<=6) {
			int num=(int)(Math.random()*45)+1;
			System.out.println(num);
			i=i+1;
		}
	}
}
                                                