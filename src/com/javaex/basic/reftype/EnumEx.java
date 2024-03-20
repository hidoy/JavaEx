package com.javaex.basic.reftype;

public class EnumEx {
	// enum 메서드 테스트
	public static void main(String[] args) {
		Week today = Week.WEDNESDAY;
		
		System.out.println(today);
		
		System.out.printf("Today is %s(%d)%n",today.name(),today.ordinal());
		
		String strWeek = "FRIDAY";
		Week obj = Week.valueOf(strWeek);
		System.out.printf("obj is %s(%d)%n",obj.name(), obj.ordinal());
	}

}
