package com.javaex.basic.pratice;

public class PraticeLoopEx {
	1.
	While 문
	index=0
	index=1
	index=2
	for문
	order=0
	order=1
	order=2
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("while 문");
			int index=0;
			while(index < 3) {
				System.out.println("index="+ index);
				index++;
			}
			System.out.println("for문");
			for(int order=0;order<3;order++) {
				System.out.println("order=" + order);
			}
			
			scanner.close();
		}

	2.
	**
	**
	**
	**
		public static void main(String[] args) {
			int x,y;
			for(x=0;x<4;x++) {
				for(y=0;y<2;y++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}

	3.
	***
	***
	***
	***

		public static void main(String[] args) {
			int x,y;
			for(x=0;x<4;x++) {
				for(y=2;y>=0;y--) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}

	4.

	1
	2
	3
	4

	-----------

	10
	8
	6
	4
	2

		public static void main(String[] args){
			for(int i=1;i<5;i++){
				System.out.println(i);
			}
			System.out.println("=============");

			for(int i=10; i>0;i=i-2) {
				System.out.println(i);
			}
		}

	5.
	1
	2
	3
	4
	5

		public static void main(String[] args){
			 int i=1;
			 boolean flag=true;
			 
			 while(flag) {
				 if(i>=5) {
					 flag = false;
				 }
				 System.out.println(i);
				 i=i+1;
			 }
		}


	6.
		public static void main(String[] args){
			for(int i=1;i<=100;i++) {
				if(i%5==0 && i%7==0) {
					System.out.println(i);
				}
			}
		}

	7.
		public static void main(String[] args){
			Scanner scanner= new Scanner(System.in);
			int num;
			num=scanner.nextInt();
			for(int i=1;i<=num;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(i);
				}
				System.out.println();
			}
			scanner.close();
		}

	8.

		public static void main(String[] args){
			Scanner scanner= new Scanner(System.in);
			for(int i=1;i<=9;i++) {
				for(int j=2;j<=9;j++) {
					System.out.print(j + "*" + i + "=" + i*j + "\t");
				}
				System.out.println();
			}
			scanner.close();
		}

	9.
		public static void main(String[] args){
			Scanner scanner= new Scanner(System.in);
			for(int i=1;i<=10;i++) {
				for(int j=i;j<=i+9;j++) {
					System.out.print(j + "\t");
				}
				System.out.println();
			}
			scanner.close();
		}

	10.

		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int max,num;
			max=0;
			for(int i=0;i<5;i++) {
				System.out.println("숫자: ");
				num=scanner.nextInt();
				if(i==0) {
					max=num;
				}
				if(max<num) {
					max=num;
				}
			}
			System.out.println("최댓값은 " + max + "입니다.");
			scanner.close();
		}

	11.

		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int num,sum=0;
			num=scanner.nextInt();
			for(int i=num%2;i<=num;i=i+2) {
				if(i==0) {
					i=2;
				}
				sum=sum+i;
			}
			System.out.println("결과값은 " + sum + "입니다.");
			scanner.close();
		}

	12.

		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int num,sum=1;
			num=scanner.nextInt();
			for(int i=1;i<=num;i++) {
				sum=sum*i;
			}
			System.out.println("결과값은 " + sum + "입니다.");
			scanner.close();
		}

	13.
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int num,sum=0;
			num=scanner.nextInt();
			for(int i=1;i<=num;i++) {
				if(i!=num) {
					System.out.print(i + "+");
				}
				else {
					System.out.println(i);
				}
				sum=sum+i;
			}
			System.out.println();
			System.out.println("합계 : "+ sum);
			scanner.close();
		}

	14.

		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int num,sum=0;
			num=scanner.nextInt();
			for(int i=1;i<=num;i++) {
				if(i!=num) {
					System.out.print(i + "+");
				}
				else {
					System.out.println(i);
				}
				sum=sum+i;
			}
			System.out.println();
			System.out.println("합계 : "+ sum);
			scanner.close();
		}

	15.
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int num;
			num=scanner.nextInt();
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					System.out.println(i);
				}
			}
			scanner.close();
		}

	더 간단하게 짜고 싶다면 i<=num 부분을 i <= 루트( num) 을 하고 if(num%i==0) 일떄 배열에다가 저장?하고 마지막에 프린트는 더 긴가...

	16.

		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int num,sum,count;
			sum=0;
			count=0;
			num=scanner.nextInt();
			for(int i=5;i<=num;i=i+5) {
				sum=sum+i;
				count++;
			}
			System.out.println("5의 배수의 개수: " + count);
			System.out.println("5의 배수의 합: " + sum);
			scanner.close();
		}

	17.

		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.print("숫자를 입력하세요: ");
			int num;
			num=scanner.nextInt();
			for(int i=num;i>=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			scanner.close();
		}

	18.

		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.print("숫자를 입력하세요: ");
			int num;
			num=scanner.nextInt();
			for(int i=num;i>=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=2;i<=num;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			scanner.close();
		}


	19.

		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			int num,account=0,money;
			while(true) {
				System.out.println("------------------------");
				System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
				System.out.println("------------------------");
				System.out.print("선택>");
				num=scanner.nextInt();
				if(num==1) {
					System.out.print("예금액>");
					money=scanner.nextInt();
					account=account+money;
				}
				else if(num==2) {
					System.out.print("출금액>");
					money=scanner.nextInt();
					account=account-money;
				}
				else if(num==3) {
					System.out.println("잔고액>" + account);
				}
				else if(num==4) {
					System.out.println("프로그램 종료");
					break;
				}
				else {
					System.out.println("다시 입력해주세요");
				}
			}
			
			scanner.close();
		}


	20.

	public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			char decision='n';
			System.out.println("====================================");
			System.out.println("\t [숫자맞추기게임 시작]");
			System.out.println("====================================");
			int ans= (int)(Math.random()*100)+1;
			while(decision!='y') {
				int num;
				num=scanner.nextInt();
				if(ans<num) {
					System.out.println("더 낮게");
				}
				else if (ans>num) {
					System.out.println("더 높게");
				}
				else {
					System.out.println("맞았습니다");
					ans= (int)(Math.random()*100)+1;
					System.out.print("게임을 종료하시겠습니까? (y/n) >>");
					String str=scanner.next();
					decision=str.charAt(0);
				}
				
			}
			System.out.println("====================================");
			System.out.println("\t [숫자맞추기게임  종료]");
			System.out.println("====================================");
			scanner.close();
		}




































}
