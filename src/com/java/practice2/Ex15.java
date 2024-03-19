package com.java.practice2;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		String sign ="";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("부호: ");
		sign = scanner.next();
		
		System.out.print("첫번째 값: ");
		i = scanner.nextInt();
		
		System.out.print("두번째 값: ");
		j = scanner.nextInt();
		
		if(sign.equals("+")) {
			System.out.println(i + "+" + j +"=" +(double)(i+j));
		} else if(sign.equals("-")) {
			System.out.println(i + "-" + j +"=" +(double)(i-j));
		} else if(sign.equals("*")) {
			System.out.println(i + "*" + j +"=" +(double)(i*j));
		} else if(sign.equals("/")) {
			System.out.println(i + "/" + j +"=" +(double)(i/j));
		} else {
			System.out.println("알 수 없는 연산자입니다");
		}
		scanner.close();

	} 

}
