package com.javaex.ex07.copy;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
        String s1=new String();
        System.out.println("친구를 3명 등록해 주세요");

        
        for(int i=0;i<3;i++) {
        	s1=sc.next();
        	friendArray[i]=new Friend();
        	friendArray[i].setName(s1);
        	s1=sc.next();
        	friendArray[i].setHp(s1);
        	s1=sc.next();
        	friendArray[i].setSchool(s1);
        }
        //친구정보 3명 입력 로직 --> 반복문 사용
            
      
        //for문 끝
        
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
        	System.out.println(friendArray[i].getName());
        	System.out.println(friendArray[i].getHp());
        	System.out.println(friendArray[i].getSchool());
        }

        sc.close();
    }

}
