package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num = scanner.nextInt();
		
		if(num > 0) {
			if(num % 2==0) {
				System.out.println("짝수입니다.");}
			else
				System.out.println("홀수입니다.");} 
	
		else if(num < 0) {
			System.out.println("음수입니다.");}
		else {
			System.out.println("0입니다.");}
		scanner.close();	
		

	}

}
