package com.javaex.basic.reftype;
import java.util.Arrays;

public class ArrayCopy {
	// 배열은 크기 변경 불가
	// 공간을 늘리고자 한다면 새 배열 생성 후 복사

	public static void main(String[] args) {
		// for 문을 이용한 배열 복사
		arrayCopyByFor();
		// System을 이용한 배열 복사
		arrayCopySystem();
	}
	
	public static void arrayCopyByFor() {
		int scores[] = {1,2,3};
		int[] newArray=new int[10];
		for(int i=0;i<scores.length;i++) {
			newArray[i]=scores[0];
		}
		System.out.println(Arrays.toString(newArray));
	}
	// 배열 유틸리티 클래스를 이용한 출력
	public static void arrayCopySystem() {
		int source[]= {1,2,3};
		int target[]=new int[10];
		
		System.out.println("source: "+Arrays.toString(source));
		// 배열 복제
		System.arraycopy(source, 0, target, 0, 3);
		
		System.out.println("target: "+Arrays.toString(target));
		
		// Enhanced For
		//for (추출된 데이터: 원본 배열 혹은 켈렉션)
		for(int value:target) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}
}
