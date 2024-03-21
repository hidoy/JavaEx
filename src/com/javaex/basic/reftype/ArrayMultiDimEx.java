package com.javaex.basic.reftype;

public class ArrayMultiDimEx {

	public static void main(String[] args) {
		// 2차원 배열 선언
		int[][] twoDimen = new int[5][10]; // 5*10
		
		int[][] table = {
				{1,2,3,4,5,6,7,8,9,10},
				{2,3,4,5,6,7,8,9,10,1},
				{3,4,5,6,7,8,9,10,1,2,},
				{4,5,6,7,8,9,10,1,2,3,},
				{5,6,7,8,9,10,1,2,3,4,}
		};	// 5행 10열
		
		System.out.println(table);
		System.out.println("table.length:" + table.length);
		System.out.println("table[0].length: " + table[0].length);
		
		int sum=0;	// 내부 데이터 합산
		// 행 루프
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table[i].length;j++) {
				System.out.print(table[i][j]);
				sum+=table[i][j];
			}
			System.out.println();
		}
		System.out.println(sum);
	}
	
}
