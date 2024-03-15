package com.java.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("너비를 입력하세요:");
		int x = scanner.nextInt();
		System.out.print("높이를 입력하세요:");
		int y = scanner.nextInt();
		
		double size; double area;
		size=(x*2)+(y*2);
		area=x*y;
		
		System.out.println("사각형 둘레는 " + size);
		System.out.println("사각형 넓이는 " + area);
		
		scanner.close();

	}

}
