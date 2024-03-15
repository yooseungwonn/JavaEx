package com.java.practice2;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요.");
		int age = scanner.nextInt();
		if (age >=0 && age < 7) {
			System.out.println("취학전 아동//무료입니다");
		} else if(age <=13) {
			System.out.println("초등학생//2000원입니다");
		} else if(age <=16) {
			System.out.println("중학생//3000원입니다");
		} else if(age <=19) {
			System.out.println("고등학생//4000원입니다");
		} else {
			System.out.println("성인//5000원입니다");
		}
		scanner.close();

	}

}
