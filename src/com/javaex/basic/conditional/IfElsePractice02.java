package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자입력:");
		int num = scanner.nextInt();
		
		if(num == 1) {
			System.out.print("R101호입니다");}
		else if(num == 2) {
			System.out.print("R202호입니다");}
		else if(num == 3) {
			System.out.print("R303호입니다");}
		else if(num == 4) {
			System.out.print("R404호입니다");}
		else {
			System.out.print("상담하세요");}
		
		scanner.close();

	}

}
