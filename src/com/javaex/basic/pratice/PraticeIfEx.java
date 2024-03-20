package com.javaex.basic.pratice;

public class PraticeIfEx {
	1. 1 = -> ==

			2. byte short int long string char

			3. if(0 < age < 18) -> if(age>0 && age<18)

			4. (x=0) -> (x==0)

			5. 
			2번그룹입니다

			2번그룹입니다

			2번그룹입니다

			1번그룹입니다

			1번그룹입니다

			6.

			public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("나이를 입력해주세요");
					System.out.print("나이: ");
					int age;
					age=scanner.nextInt();
					if(age>=19 && age<65) {
						System.out.println("1번그룹 입니다");
					}
					else {
						System.out.println("2번 그룹입니다");
					}
					scanner.close();
				}






			7.

				public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("나이를 입력해주세요");
					System.out.print("나이: ");
					int age;
					age=scanner.nextInt();
					if(age>=0 && age<=7) {
						System.out.println("취학전아동/무료입니다");
					}
					else if(age<=13){
						System.out.println("초등학생/2000원입니다");
					}
					else if(age<=16){
						System.out.println("중학생/3000원입니다");
					}
					else if(age<=19){
						System.out.println("고등학생/4000원입니다");
					}
					else{
						System.out.println("성인/5000원입니다");
					}
					scanner.close();
				}


			8.

				public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					double height, weight;
					System.out.println("키와 몸무게를 입력해주세요");
					System.out.print("키: ");
					height=scanner.nextDouble();
					height=height/100;
					System.out.print("몸무게: ");
					weight=scanner.nextDouble();
					double bmi= weight/(height*height);
					if(bmi<=18.5) {
						System.out.println("저체중입니다" + "\n" + bmi);
					}
					else if(bmi>=24.9) {
						System.out.println("과체중입니다" + "\n" + bmi);
					}
					else{
						System.out.println("정상체중입니다" + "\n" + bmi);
					}
					scanner.close();
				}

			9.

				public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("태어난 년도를 입력해 주세요");
					System.out.print("년도: ");
					int year;
					year = scanner.nextInt();
					int num=2023-year;
					if(num<15 || num>=65) {
						System.out.println(num + "살 무료예방접종 대상자 입니다");
					}
					else {
						System.out.println(num+ "살 무료접종 대상자가 아닙니다");
					}
					scanner.close();
				}
			}

			10.
			public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("숫자2개를 입력해주세요");
					System.out.print("숫자1: ");
					int num1,num2;
					num1=scanner.nextInt();
					System.out.print("숫자2:");
					num2=scanner.nextInt();
					if(num1>=num2) {
						System.out.println("큰수 : "+num1 + "\t 작은수 : " + num2);
					}
					else {
						System.out.println("큰수 : "+num2 + "\t 작은수 : " + num1);
					}
					
					
					scanner.close();
				}



			11.

				public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.print("첫번째 숫자: ");
					int num1,num2;
					num1=scanner.nextInt();
					System.out.print("두번째 숫자:");
					num2=scanner.nextInt();
					if(num1<num2) {
						int x;
						x=num1;
						num1=num2;
						num2=x;
					}
					System.out.println("몫 : " +num1/num2);
					System.out.println("나머지 : " +num1%num2);
					
					
					scanner.close();
				}




			12.
				public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("숫자 3개를 입력해주세요");
					System.out.print("숫자1: ");
					int num1,num2,num3;
					num1=scanner.nextInt();
					System.out.print("숫자2:");
					num2=scanner.nextInt();
					System.out.print("숫자3:");
					num3=scanner.nextInt();
					if(num1<num2) {
						if(num3<num1) {
							num1=num3;
						}
					}
					else {
						if(num2<num3) {
							num1=num2;
						}
						else {
							num1=num3;	
						}
					}
					System.out.println("가장 작은수는 " + num1 + "입니다");
					
					
					scanner.close();
				}


			13.

			public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.print("숫자1: ");
					int num1,num2;
					num1=scanner.nextInt();
					System.out.print("숫자2:");
					num2=scanner.nextInt();
					if(num1>num2) {
						int x;
						x=num1;
						num1=num2;
						num2=x;
					}
					if(num2%num1==0) {
						System.out.println(num1+"는(은)"+num2+"의 약수입니다.");
					}
					else {
						System.out.println(num1+"는(은)"+num2+"의 약수가 아닙니다.");
					}
					
					scanner.close();
				}

			14.

				public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("사번(정수)를 입력해주세요");
					System.out.print("사번 : ");
					int team;
					team=scanner.nextInt();
					if(team>=0) {
						System.out.println((char)(65+(team%3))+"팀입니다");
					}
					else {
						System.out.println("잘못입력하셨습니다");
					}
					scanner.close();
				}

			15.

				public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("출력되는 내용을 입력하세요");
					System.out.print("기호 : ");
					String input=scanner.next();
					char oper;
					oper=input.charAt(0);
					double num1,num2;
					System.out.print("숫자1: ");
					num1=scanner.nextDouble();
					System.out.print("숫자2: ");
					num2=scanner.nextDouble();
					if(oper=='+') {
						System.out.println("결과는: "+ (num1+num2));
					}
					else if(oper=='-') {
						System.out.println("결과는: "+ (num1-num2));
					}
					else if(oper=='*') {
						System.out.println("결과는: "+ (num1*num2));
					}
					else if(oper=='/') {
						if(num2!=0) {
							System.out.println("결과는: "+ (num1/num2));
						}
						else {
							System.out.println("계산할 수 없습니다.");
						}
					}
					else {
						System.out.println("계산할 수 없는 기호입니다.");
					}
					scanner.close();
				}

			16.

				public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					double x;
					System.out.println("숫자를 입력해 주세요");
					System.out.print("숫자 : ");
					x=scanner.nextDouble();
					System.out.println("계산 결과는 ");
					if(x<=0) {
						System.out.println((x*x*x-9*x+2));
					}
					else {
						System.out.println(7*x+2);
					}
					System.out.println("입니다.");
					scanner.close();
				}

			17.

				public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					double x;
					System.out.println("수익을 입력해 주세요");
					System.out.print("금익 : ");
					x=scanner.nextDouble();
					if(x<0) {
						System.out.println("금액을 잘못입력했습니다");
						scanner.close();
						return;
					}
					System.out.println("소득세는 ");
					if(x<=1000) {
						System.out.println((x*0.09));
					}
					else if(x<=4000){
						System.out.println((1000*0.09)+0.18*(x-1000));
					}
					else if(x<8000){
						System.out.println(1000*0.09+3000*0.18+0.27*(x-4000));
					}
					else {
						System.out.println(1000*0.09+3000*0.18+4000*0.27+0.36*(x-8000));
					}
					System.out.println("입니다.");
					scanner.close();
				}

			18.

				public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("알파벳 1글자(소문자)를 입력하세요");
					System.out.print("알파벳 : ");
					String alpa=scanner.next();
					char a=alpa.charAt(0);
					switch(a) {
					case 'a' :
					case 'e' :
					case 'i' :
					case 'o' :
					case 'u' :
						System.out.println("모음입니다");
						break;
					default :
						System.out.println("자음입니다");
					}
					scanner.close();
				}

			19 ~ 22 똑같은 문제?
			23.
				public static void main(String[] args) {
					Scanner scanner = new Scanner(System.in);
					System.out.println("태어난 년도를 입력해주세요");
					System.out.print("년도 : ");
					int year,age;
					year=scanner.nextInt();
					age=2023-year;
					System.out.println("올해 : 2023");
					System.out.println("태어난 해 : " +year);
					System.out.println("나이 : "+ age);
					System.out.println("------------------------------");
					if(age>=20) {
						System.out.println("20살이상");
						if(2023%2==0 && year%2==0 || 2023%2==1 && year%2==1) {
							System.out.println("건상검진해");
							if(age>=40) {
								System.out.println("암 검사 ");
							}
							else {
								System.out.println("암 검사 X");
							}
						}
						else {
							System.out.println("건상검진해 아님");
						}
					}
					else {
						System.out.println("20살 미만 건강검진대상이 아님");
					}
					
					scanner.close();
					
				}




}
