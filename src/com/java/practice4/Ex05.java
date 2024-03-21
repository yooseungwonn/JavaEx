package com.java.practice4;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c, d, e;
		int sum=0;
		
		System.out.print("숫자1: ");
		a = scanner.nextInt();
		System.out.print("숫자2: ");
		b = scanner.nextInt();
		System.out.print("숫자3: ");
		c = scanner.nextInt();
		System.out.print("숫자4: ");
		d = scanner.nextInt();
		System.out.print("숫자5: ");
		e = scanner.nextInt();
		sum = a+b+c+d+e;
		int average = sum/5;
		System.out.println("평균은 " + (double)average + " 입니다");


		


	}

}
