package com.java.practice2;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("알파벳을 입력하세요: ");
		String str = scanner.next();
		
		if(str.equals("a")) {
			System.out.println("모음입니다 ");
		} else if(str.equals("i")) {
			System.out.println("모음입니다 ");
		} else if(str.equals("e")) {
			System.out.println("모음입니다 ");
		} else if(str.equals("o")) {
			System.out.println("모음입니다 ");
		} else if(str.equals("u")) {
			System.out.println("모음입니다 ");
		} else {
			System.out.println("자음입니다 ");
		}
		scanner.close();

	}

}
