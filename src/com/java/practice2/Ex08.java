package com.java.practice2;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력하세요.");
		System.out.print("키");
		int k = scanner.nextInt();
		System.out.print("몸무게");
		int kg = scanner.nextInt();
		
		double bmi=(double)kg/(((double)k/100.0)*((double)k/100.0));
		if(bmi <= 24.9 && bmi >=18.5) {
			System.out.println("정상체중");
		} else if(bmi < 18.5) {
			System.out.println("저체중");
		} else {
			System.out.println("과체중");
		}
		System.out.print("BMI: " + bmi);
		scanner.close();
			
		
		

	}

}
