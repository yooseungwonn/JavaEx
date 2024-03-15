package com.java.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월급을 입력하세요:");
		int num = scanner.nextInt();
		int save = num*120;
		System.out.print("최대 저축액은 " + save + "원입니다");
		
		scanner.close();
		

	}

}
