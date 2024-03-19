package com.java.practice2;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		int s;
		double tax;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("수익을 입력하세요: ");
		s = scanner.nextInt();
		
		if(s >= 0 && s <= 1000) {
			tax = 0.09*s;
			System.out.println("소득세는 " + tax +"입니다");
		} else if(s <= 4000) {
			tax = 1000*0.09+0.18*(s-1000);
			System.out.println("소득세는 " + tax +"입니다");
		} else if(s < 8000) {
			tax = 1000*0.09+3000*0.18+0.27*(s-4000);
			System.out.println("소득세는 " + tax +"입니다");
		} else if(s >= 8000) {
			tax = 1000*0.09+3000*0.18+4000*0.27+0.36*(s-8000);
			System.out.println("소득세는 " + tax +"입니다");
		} else {
			System.out.println("잘못 입력했습니다");
		}
		scanner.close();

	}

}
