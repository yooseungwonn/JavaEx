package com.java.practice3;

public class Ex08 {

	public static void main(String[] args) {
		for(int a = 2; a <=9 ; a++) {
			for (int b = 1; b<=9 ; b++) {
				System.out.println(a+"X"+b+"="+(a*b));
				}
			}
			
			
			
		// 2. 가로로 출력하는 전체 구구단
		for(int a = 1; a <=9 ; a++) {
			for (int b = 2; b<=9 ; b++) {
				System.out.print(b+"X"+a+"="+(a*b)+ "\t");
				}
				System.out.println();
			}

	}

}
