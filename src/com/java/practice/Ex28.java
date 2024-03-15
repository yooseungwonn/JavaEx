package com.java.practice;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		final double EXCHANGE=1230.95;
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요:");
		int w = scanner.nextInt();
		double d=w/EXCHANGE;
		System.out.println("받을 달러는 " + d);
		
		scanner.close();
		

	}

}
