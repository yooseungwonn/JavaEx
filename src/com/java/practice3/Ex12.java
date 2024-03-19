package com.java.practice3;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		int fact=1;
		int i, n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자: ");
		n = scanner.nextInt();
		
		for(i=1;i<=n;i++) {
			fact *= i;
			
		}
		System.out.println("결과값: " + fact);
		

	}
	
	

}
