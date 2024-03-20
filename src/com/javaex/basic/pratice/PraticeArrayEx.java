package com.javaex.basic.pratice;

public class PraticeArrayEx {
	1.
	int i 를 intArray.length 까지 돌리면 범위 초과하기 때문

	2.
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			double[] doubleArray = new double[5];
			for(int i=0;i<3;i++) {
				doubleArray[i]=scanner.nextDouble();
			}
			for(int i=2;i>=0;i--) {
				System.out.printf("%.1f %n",doubleArray[i]);
			}
			scanner.close();
		}

	3.
	3 6 9
	Scanner scanner = new Scanner(System.in);
			int[] intA= {3,6,9};
			
			int[] intB;
			intB = intA;
			intB[0]=20;
			intB[2]=10;
			
			for(int i=0;i<intA.length;i++) {
				System.out.println(intA[i]);
			}
			scanner.close();
		}

	4.
	public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			int[] data= {1,3,5,8,9,11,15,19,18,20,30,33,31};
			int sum=0,num=0;
			for(int i=0;i<data.length;i++) {
				if(data[i]%3==0) {
					num++;
					sum=sum+data[i];
				}
			}
				System.out.printf("주어진 배열에서 3의 배수의 개수=> %d %n 주어진 배열에서 3의 배수의 합=> %d",num,sum);
			scanner.close();
		}

	5.
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			double num,sum=0;
			for(int i=0;i<5;i++) {
				num=scanner.nextDouble();
				sum=sum+num;
			}
			System.out.printf("평균은 %.1f입니다",sum/5);
			scanner.close();
		}

	6.
	Scanner scanner = new Scanner(System.in);
			char[] c = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
			for(int i=0;i<c.length;i++) {
				if(c[i]==' ') {
					c[i]=',';
				}
			}
			for(int i=0;i<c.length;i++) {
				System.out.print(c[i]);
			}
			scanner.close();
		}

	7.

	public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			int[] wonArray = new int[10];
			wonArray[0] = 50000;
			wonArray[1] = 10000;
			wonArray[2] = 5000;
			wonArray[3] = 1000;
			wonArray[4] = 500;
			wonArray[5] = 100;
			wonArray[6] = 50;
			wonArray[7] = 10;
			wonArray[8] = 5;
			wonArray[9] = 1;
			int num=0,account;
			System.out.print("금액 :");
			account=scanner.nextInt();
			for(int i=0;i<wonArray.length;i++) {
				num=account/wonArray[i];
				account=account-wonArray[i]*num;
				System.out.printf("%d원 : %d 개 %n",wonArray[i],num);
			}
			scanner.close();
		}


	8.

		public static void main(String[] args){
			int[] num=new int[6];
			for(int i=0;i<6;i++) {
				num[i]=(int)(Math.random()*45)+1;
				for(int j=0;j<i;j++) {
					if(num[j]==num[i]) {
						i--;
						break;
					}
				}
			}
			for(int i=0;i<6;i++) {
				System.out.println(num[i]);
			}
		}

}
