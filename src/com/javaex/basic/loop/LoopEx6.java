package com.javaex.basic.loop;

public class LoopEx6 {
	public static void main(String[] args) {
		int x=6;
		int y=14;
		while(x!=y) {
			if(x<y) {
				x=x+6;
			}
			else {
				y=y+14;
			}
		}
		System.out.println(x);
	}
}
