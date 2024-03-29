package com.javaex.exception;

import java.io.IOException;

// CheckedException : 반드시 예외 처리 필요
// try ~ catch
// throw로 예외 처리 가능

// 사용자 정의 예외
class CustomArithException extends ArithmeticException{
	// 필드
	private int num1;
	private int num2;
	
	// 생성자
	public CustomArithException(String message,int num1,int num2) {
		super(message);
		this.num1=num1;
		this.num2=num2;
		
	}
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2(){
		return num2;
	}
}
public class ThrowsExceptApp {
	public static void main(String[] args) {
		ThrowsExcept except=new ThrowsExcept();
		try {
			divide(100,0);
			except.executeRuntimeException();
			except.executeExcept(); // checkedException 은 반드시 예외 처리!
		}
		catch(IOException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		catch(CustomArithException e) {
			System.err.println("에러메세지:" + e.getMessage());
			System.err.println("나누어지는 수" + e.getNum2());
		}
		catch(RuntimeException e) {
			System.err.println(e.getMessage());
		}
	} 
	
	// 두개의 숫자를 나누는 코드
	public double divide(int num1,int num2) {
		// 예외 발생시 보다 구체적인 예외로 변환한 후
		// 예외 상황의 정보를 추가해서 예외를 반환하는 것이 좋다
		double result=0;
		
		try {
			result=num1/num2;
		}
		catch(ArithmeticException e) {
			// 보다 구체적 예외로 전환
			CustomArithException cae=new CustomArithException("사용자 정의 Exception",num1,num2);
			// 전환된 사용자 정의 예외를 throw
			throw cae;
		}
		
		
		return result;
	}
	
}
