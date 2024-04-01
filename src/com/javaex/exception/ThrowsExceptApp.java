package com.javaex.exception;

import java.io.IOException;

// CheckedException : 반드시 예외 처리 필요
// try ~ catch
// throw로 예외 처리 가능

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
	
	
}
