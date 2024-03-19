package com.java.practice2;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("태어난 연도를 입력하세요: ");
		int y = scanner.nextInt();
		
		int age;
		age = 2023-y;
		
		if(age <15 || age >= 65) {
			System.out.println(age +"살 " + "무료 예방접종입니다");
		}
		else {
			System.out.println(age +"살 " + "무료 예방접종 대상자가 아닙니다");
		}
		scanner.close();

	}

}
