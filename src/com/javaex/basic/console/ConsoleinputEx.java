bpackage com.javaex.basic.console;

import java.util.Scanner;
public class ConsoleinputEx {
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		// 데이터 입력
		int age;
		
		System.out.print("나이는?:");
		age = scanner.nextInt();
		
			String name;
		System.out.print("이름은?:");
		name = scanner.next();
		
		System.out.println(name);
		System.out.println(age);
		// 스캐너 닫기
		scanner.close();
	}
}
