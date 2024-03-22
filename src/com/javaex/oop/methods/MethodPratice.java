package com.javaex.oop.methods;

public class MethodPratice {
	public static void main(String[] args) {
		printHelloMethod();
		printNumbers();
		getRandomNumber();
		getSum();
		printOddOrEven(5);
		printStringLength("apple");
		getLargeNumber(5,6);
		System.out.println(concatenateStrings("apple","pineapple"));
		sumAll(1,2,3,4,5,6,7);
		System.out.println(concatenateStrings("abc","asdfsafa,sfsfs","asdfs"));
	}
	private static void printHelloMethod() {
		System.out.println("Hello Method!");
	};
	private static void printNumbers() {
		for(int i=0;i<=10;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	};
	private static int getRandomNumber(){
		int num=(int)(Math.random()*101);
		return num;
	};
	private static int getSum() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+i;
		}
		return sum;
	};
	private static void printOddOrEven(int num) {
		if(num%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
	};
	private static void printStringLength(String str1) {
		System.out.println(str1.length());
	};
	private static int getLargeNumber(int x,int y) {
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
	};
	private static String concatenateStrings(String a,String b) {
		String c=new String();
		c=a+b;
		return c;
	};
	private static int sumAll(int...values) {
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum=sum+values[i];
		}
		return sum;
	};
	private static String concatenateStrings(String...values) {
		String c=new String();
		for(int i=0;i<values.length;i++) {
			c=c+values[i];
		}
		return c;
	};
	
}