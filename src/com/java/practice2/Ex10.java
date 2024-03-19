package com.java.practice2;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자2개를 입력하세요.");
		System.out.print("숫자1: ");
		int x = scanner.nextInt();
		System.out.print("숫자2: ");
		int y = scanner.nextInt();
		
		if(x >= y) {
			System.out.println("큰 수: " + x);
			System.out.print("작은 수: " + y);
		}
		else {
			System.out.println("큰 수: " + y);
			System.out.print("작은 수: " + x);
		}
		scanner.close();

	}

}
