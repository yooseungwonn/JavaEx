package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요");
		
		// for문 시작 친구정보 3명 입력 로직 --> 반복문 사용
		for(int i=0;i<3;i++) {
			// 데이터 입력
			String name, hp, school;
			System.out.print("이름: ");
			name = sc.next();
			System.out.print("핸드폰: ");
			hp = sc.next();
			System.out.print("학교: ");
			school = sc.next();
			
			Friend newFriend = new Friend();
			newFriend.setName(name);
			newFriend.setHp(hp);
			newFriend.setSchool(school);
			
			// 배열에 참조주소 할당
			friendArray[i] = newFriend;
			System.out.println("~~~~~~~~~~~~~~~~~~");
		}
		
		for(int i=0;i<friendArray.length;i++) {
			friendArray[i].showInfo();
		}
		sc.close();

	}

}
