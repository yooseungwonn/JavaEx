package com.java.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("상품가격:");
		int p = scanner.nextInt();
		System.out.print("받은돈:");
		int m = scanner.nextInt();
		System.out.println("==============");
		double tax=p*0.1; double re=m-p;
		System.out.println("받은돈:" + (double)m);
		System.out.println("상품가격:" + (double)p);
		System.out.println("부가세:" + tax);
		System.out.println("잔액:" + re);
		
		scanner.close();
		

	}

}
