package com.java.practice2;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("태어난 연도를 입력하세요: ");
		int y = scanner.nextInt();
		
		System.out.println("올해: 2023 ");
		System.out.println("태어난 해: " + y);
		int age;
		age = 2023-y;
		System.out.println("나이: " + age);
		System.out.println("---------------------");
		
		
		if(age >= 20) {
			System.out.println(age +"살 " + "무료 건강검진입니다");
		}
		else {
			System.out.println(age +"살 " + "무료 건강검진 대상자가 아닙니다");
		}
		if(age % 2 == 0) {
			System.out.println(age +"살 " + "검사대상입니다");
		}
		else {
			System.out.println(age +"살 " + "검사대상이 아닙니다");
		}
		if(age >= 40) {
			System.out.println(age +"살 " + "암 검사대상입니다");
		}
		else {
			System.out.println(age +"살 " + "암 검사대상이 아닙니다");
		}
		scanner.close();

	}

}
