package com.java.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("500원 개수:");
		int w = scanner.nextInt();
		System.out.print("100원 개수:");
		int x = scanner.nextInt();
		System.out.print("50원 개수:");
		int y = scanner.nextInt();
		System.out.print("10원 개수:");
		int z = scanner.nextInt();
		
		int total=(500*w)+(100*x)+(50*y)+(10*z);
		System.out.print("동전의 총합은 " + total + "원");

	}

}
