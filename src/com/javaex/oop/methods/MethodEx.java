package com.javaex.oop.methods;

public class MethodEx {

	public static void main(String[] args) {
		// 매개변수 X, 리턴 X
		printMessage();
		// 매개변수 X, 리턴 O
		String message = getMessage();
		System.out.println(message);
		// 매개변수 O, 리턴 X
		printDevide(4, 0);
		// 매개변수 O, 리턴 O
		int num1 = 4, num2 = 5;
		//double sum = getSum(num1, num2);
		double sum = getSum(num1, num2, 6);
		System.out.println(sum);
	}
	private static void printMessage() {
		// 매개변수 X
		// 리턴 X -> void
		System.out.println("매개변수 없고, 리턴도 없는 메서드");
	}
	private static String getMessage() {
		return "메개변수 없지만 리턴은 있는 메서드";
	}
	private static void printDevide(int num1, int num2) {
		// 리턴 타입이 없어도 return 할 수 있음
		// 남은 코드를 더이상 수행하지 않고 제어를 돌려줄 때
		System.out.println("매개변수 있고, 리턴 없는 메서드");
		if(num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return;
		}
		System.out.printf("%d / %d = %d%n", num1, num2, num1/num2);
	}
	private static double getSum(double num1, double num2) {
		System.out.println("매개변수 있고, 리턴도 있는 메서드");
		return num1 + num2;
	}
	private static double getSum(double num1, double num2, double num3) {
		System.out.println("매개변수 있고, 리턴도 있는 메서드");
		return num1 + num2 + num3;
	}

}
