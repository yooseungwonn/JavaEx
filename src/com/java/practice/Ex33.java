package com.java.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		final double PI=3.14;
		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름:");
		int r = scanner.nextInt();
		double v=(4.0/3.0)*PI*r*r*r;
		System.out.println("구의 부피는 " + v);
		
		scanner.close();

	}

}
