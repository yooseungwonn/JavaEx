package com.java.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("전체 금액:");
		int m = scanner.nextInt();
		
		int rm=m-(m%1000);
		System.out.println("실제지불금액: " + rm);
		
		scanner.close();

	}

}
