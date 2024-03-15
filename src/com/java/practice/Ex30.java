package com.java.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		final double MILE=1.609;
		Scanner scanner = new Scanner(System.in);
		System.out.print("마일을 입력하세요:");
		int m = scanner.nextInt();
		
		double k=m*MILE;
		System.out.println((double)m + "마일은 " + k + "킬로미터입니다");
		
		scanner.close();

	}

}
