package com.java.practice;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("전체 연필개수:");
		int x = scanner.nextInt();
		System.out.print("전체 인원수:");
		int y = scanner.nextInt();
		
		int quo=x/y; int re=x%y;
		System.out.println("1인당 연필개수: " + quo);
		System.out.println("나머지 개수: " + re);
		
		scanner.close();

	}

}
