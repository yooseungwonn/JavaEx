package com.java.practice3;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		int sum =0;
		int i, n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자: ");
		n = scanner.nextInt();
		
		for(i=1;i<=n; i++) {
			sum += i;
		}
		System.out.println("합계: " + sum);
		scanner.close();

	}

}
