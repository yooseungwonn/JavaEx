package com.javaex.oop.methods;


public class MethodPractice {

	public static void main(String[] args) {
		// 문제 1
		printHelloMethod();
		// 문제 2
		printNumbers();
		// 문제 3
		int rnd = getRandomNumber();
		System.out.println(rnd);
		// 문제 4
		int j = getSum();
		System.out.println(j);
		// 문제 5
		printOddOrEven(2024);
		// 문제 6
		printStringLength("Java Programming");
		// 문제 7
		int largeNumber = getLargeNumber(10, 20);
		System.out.println(largeNumber);
		// 문제 8
		System.out.println(concatenateStrings("Java ", "programming"));
		// 문제 9
		System.out.println(sumAll(1, 2, 3, 4, 5, 6, 7, 8, 9));
		// 문제 10
		System.out.println(concatenateStrings("Java ", "programming ", "is ", "fun!" ));
	}

	private static void printHelloMethod() {
		System.out.println("Hello Method");		
	}
	
	private static void printNumbers() {
		for(int i=1;i<=10;i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	private static int getRandomNumber() {
		 
		int rnd = (int)(Math.random()*101);
		return rnd;
	}
	private static int getSum() {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			sum += i;
		}
		return sum;
	}
	public static void printOddOrEven(int value) {
		// 3항 연산 : 조건식 ? 참일 때의 값 : 거짓일 때의 값
		System.out.println(value % 2 == 0 ? "짝수" : "홀수");
	}
	private static void printStringLength(String str) {
		System.out.println(str.length());
	}
	private static int getLargeNumber(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		} 
		else {
			return num2;
		}
	}
	private static String concatenateStrings(String str1, String str2) {
		return str1 + str2;
	}
	private static int sumAll(int ... values) {
		int total = 0;
		for(int val: values) {
			total += val;
		}
		return total;
	}
	private static String concatenateStrings(String ... values) {
		String result = "";
		
		for(String val: values) {
			result +=val;
		}
		return result;
	}

}
