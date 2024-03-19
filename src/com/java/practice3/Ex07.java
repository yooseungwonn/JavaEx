package com.java.practice3;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int i,j,n;

        System.out.print("숫자를 입력하세요 : ");
     	Scanner scanner = new Scanner(System.in);
	    n = scanner.nextInt();

        for(i=1;i<=n;i++){
        for(j=1;j<=i;j++)
         System.out.print(i);
       System.out.println("");
       }

	}

}
