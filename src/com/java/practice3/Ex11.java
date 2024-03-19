package com.java.practice3;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자: ");
		int number = scanner.nextInt();
		;
		
		int oddsum = 0;
		int evensum = 0;
		
		for(int i=1;i <= number;i++) {
			if(i%2 ==0) {
				evensum  += i;
				
			}
			else {
				oddsum += i;
				
			}
		}System.out.println("짝수결과값: " + evensum);
		System.out.println("홀수결과값: " + oddsum);
				
	}
	
	}


