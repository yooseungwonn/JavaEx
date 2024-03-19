package com.java.practice3;

import java.util.Random;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Random generator = new Random();
		int answer = generator.nextInt(100) + 1; // 1부터 100까지 랜덤수 생성
		int guess;
		
		Scanner scanner = new Scanner(System.in);
		int tries = 0;
		
		do {
			System.out.println("Q.정답을 추측하여 보시오: ");
			guess = scanner.nextInt();
			tries++;
			
			if (guess > answer) {
				System.out.println("제시한 정수가 높습니다.");
			} else if (guess < answer) {
				System.out.println("제시한 정수가 낮습니다.");
			} 
		} while (guess != answer);
		
		System.out.println("축하합니다. 시도횟수=" + tries);




	}

}
