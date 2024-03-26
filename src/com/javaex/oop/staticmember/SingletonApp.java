package com.javaex.oop.staticmember;

public class SingletonApp {
	public static void main(String[] args) {
		// Singleton s1=new Singleton();
		Singleton s1=Singleton.getIntance();
		Singleton s2=Singleton.getIntance();
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		
		// 	두 객체는 같은 객체?
		System.out.println("s1 == s2 ? " + (s1 == s2));
	}
}
