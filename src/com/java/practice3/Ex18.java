package com.java.practice3;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = scanner.nextInt();
		
		
		for(int i=n;i>=1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		

	}

}
