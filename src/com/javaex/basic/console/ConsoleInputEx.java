package com.javaex.basic.console;

import java.util.Scanner;

public class ConsoleInputEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 스캐너 열기
		int age;
		System.out.print("나이는?:");
		age = scanner.nextInt();
		
		String name;
		System.out.print("이름은?:");
		name = scanner.next();
		System.out.println("안녕하세요, " + name + "님");
		// 데이터 입력
		scanner.close();
		// 스캐너 닫기

	}

}
