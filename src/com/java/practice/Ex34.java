package com.java.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("화씨:");
		int f = scanner.nextInt();
		double c = (5.0/9.0)*(f-32.0);
		System.out.println("화씨" + (double)f + "의 섭씨온도는 " + c);
		
		scanner.close();

	}

}
