package com.java.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		final double PI=3.14;
		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름을 입력하세요:");
		int r = scanner.nextInt();
		double area=r*r*PI;
		System.out.println("원의 넓이는 " + area);
		
		scanner.close();
		
	
		
				

	}

}
