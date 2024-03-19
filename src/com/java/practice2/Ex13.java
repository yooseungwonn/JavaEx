package com.java.practice2;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자2개를 입력하세요.");
		System.out.print("숫자1: ");
		int x = scanner.nextInt();
		System.out.print("숫자2: ");
		int y = scanner.nextInt();
		
		if(x >= y) {
			if(x % y == 0) {
				System.out.println(y+ "는 " + x +"의 약수입니다");
			}
			else {
				System.out.println(y+ "는 " + x +"의 약수가 아닙니다");
			}
		}
		else {
			if(y % x == 0) {
				System.out.println(x+ "는 " + y +"의 약수입니다");
			}
			else {
				System.out.println(x+ "는 " + y +"의 약수가 아닙니다");
			}
		}
		scanner.close();

	}

}
