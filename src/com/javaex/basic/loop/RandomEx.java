package com.javaex.basic.loop;

public class RandomEx {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
		int num = (int)(Math.random()*45) +1;
		System.out.println(num);
        }
	}
}


