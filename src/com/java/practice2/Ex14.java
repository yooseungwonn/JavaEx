package com.java.practice2;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("사번을 입력하세요.");
		System.out.print("사번: ");
		int x = scanner.nextInt();
		
		if(x % 3 ==0) {
			System.out.println("a팀입니다");
		} else if (x % 3 ==1) {
			System.out.println("b팀입니다");
		} else if (x % 3 ==2) {
			System.out.println("c팀입니다");
		} else {
			System.out.println("잘못입력");
		}
		scanner.close();

	}

}
