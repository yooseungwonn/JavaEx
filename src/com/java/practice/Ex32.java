package com.java.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로:");
		int x = scanner.nextInt();
		System.out.print("세로:");
		int y = scanner.nextInt();
		double rec=(x*y)/2;
		System.out.println("삼각형 넓이는 " + rec);
		
		scanner.close();

	}

}
