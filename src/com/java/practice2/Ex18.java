package com.java.practice2;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("알파벳을 입력하세요: ");
		String str = scanner.next();
		
		switch(str) {
		case "a":
		case "i":
		case "e":
		case "o":
		case "u":
			System.out.print("모음입니다 ");
			break;
		default:
			System.out.print("자음입니다 ");
			break;
			
			
		}
		scanner.close();

	}

}
