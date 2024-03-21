package com.java.practice4;

import java.util.Arrays;
public class Ex02 {

	public static void main(String[] args) {
		double[] doubleArray= {1.2, 3.3, 6.7};
		
		double[] reverseArray = new double[3];
		 for (int i = doubleArray.length - 1, j = 0; i >= 0; i--, j++) {
           reverseArray[j] = doubleArray[i];        
           }
		 System.out.println(Arrays.toString(reverseArray));
		 

	}

}
