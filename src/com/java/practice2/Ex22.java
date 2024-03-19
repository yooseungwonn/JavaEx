package com.java.practice2;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자3개를 입력하세요.");
		System.out.print("숫자1: ");
		int x = scanner.nextInt();
		System.out.print("숫자2: ");
		int y = scanner.nextInt();
		System.out.print("숫자3: ");
		int z = scanner.nextInt();
		int max;
		if(x >= y && x >= z) {
			max = x;
		} else if (y >= x && y >= z) {
			max = y;
		} else {
			max = z;
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		scanner.close();

	}

}
