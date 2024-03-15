package com.java.practice2;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요.");
		int age = scanner.nextInt();
		if (age >=19 && age < 65) {
			System.out.println("1번그룹");
		} else {
			System.out.println("2번그룹");
		}
		scanner.close();
			

	}

}
