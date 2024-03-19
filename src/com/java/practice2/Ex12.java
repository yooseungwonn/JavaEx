package com.java.practice2;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자3개를 입력하세요.");
		System.out.print("숫자1: ");
		int x = scanner.nextInt();
		System.out.print("숫자2: ");
		int y = scanner.nextInt();
		System.out.print("숫자3: ");
		int z = scanner.nextInt();
		int min;
		if(x <= y && x <= z) {
			min = x;
		} else if (y <= x && y <= z) {
			min = y;
		} else {
			min = z;
		}
		System.out.println("가장 작은 수는 " + min + "입니다.");
		scanner.close();

	}

}
