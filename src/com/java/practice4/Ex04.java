package com.java.practice4;



public class Ex04 {

	public static void main(String[] args) {
		
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		
		for(int i=0;i<data.length;i++) {
			if(data[i] % 3 ==0){
				System.out.println(i);
			}
		}
		

	}

}
