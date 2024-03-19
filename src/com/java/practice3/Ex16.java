package com.java.practice3;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int count = 0;
	        int sum = 0;
	        int a = 0;
	        int b = 0;
	        
	        System.out.print("최대값을 입력하세요 : ");
	        int j = scanner.nextInt();
	        
	        for (int i = 1; i < j+1; i++){
	            a = i / 5;
	            b = i - (a * 5);
	            if (b == 0){
	                count++;
	                sum = sum + i;
	            }
	        }
	        System.out.println("5의 배수의 개수 : " + count);
	        System.out.println("5의 배수의 합 : " + sum);
	        

	}

}
