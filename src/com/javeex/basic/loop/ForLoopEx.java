package com.javeex.basic.loop;

import java.util.Scanner;

public class ForLoopEx {
	// 단을 입력
	// for 루트로 1 ~ 9까지 반복
	// 단 * num =

	public static void main(String[] args) {
		// 변수 초기화
		int dan, num;
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		// 단 입력
		System.out.print("단을 입력하세요.");
		dan = scanner.nextInt();
		
		// for(초기화; 반복여부체크; 증감식)
		for(num = 1; num <= 9; num++) {
			System.out.println(dan + "*" + num + "=" + (dan*num));
		}
		// 1 ~ 9 반복
		// 결과 출력
		scanner.close();
		// 스캐너 닫기

	}

}