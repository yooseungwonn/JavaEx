package com.java.practice3;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자5개를 입력하세요.");
		System.out.print("숫자1: ");
		int a = scanner.nextInt();
		System.out.print("숫자2: ");
		int b = scanner.nextInt();
		System.out.print("숫자3: ");
		int c = scanner.nextInt();
		System.out.print("숫자4: ");
		int d = scanner.nextInt();
		System.out.print("숫자5: ");
		int e = scanner.nextInt();
		int max;
		if(a >= b && a >= c && a >= d && a >= e) {
			max = a;
		} else if (b >= a && b >= c && b >= d && b >= e) {
			max = b;
		} else if(c >= a && c >= b && c >= d && c >= e){
			max = c;
		} else if(d >= a && d >= b && b >= c && d >= e) {
			max = d;
		} else {
			max = e;
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		scanner.close();

	}

}
