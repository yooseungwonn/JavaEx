package com.java.practice2;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int y;
		
		System.out.print("숫자를 입력하세요: ");
		int x = scanner.nextInt();
		
		if(x <= 0) {
			y=x*x*x-9*x+2;
			System.out.println("계산 결과는 " + (double)y +"입니다");
		}
		else {
			y=7*x+2;
			System.out.println("계산 결과는 " + (double)y +"입니다");
		}
		scanner.close();

	}

}
