package com.javaex.basic.loop;

public class LoopPractice {

	public static void main(String[] args) {
		 //forGugu();
		 //whileGugu();
		 whileStar();
		//forstar();

	}
	public static void forGugu(){
		for(int dan = 2; dan <= 9 ; dan++) {
			for(int num = 1; num <= 9 ; num++) {
			// 단수 올리기: 2, 3, 4...
			System.out.println(dan + "*" + num + "=" + dan * num);
			}
		}
	}
	public static void whileGugu() {
		int dan = 2, num;
		
		while(dan <= 9) {
			num =1;
			while(num <=9) {
			System.out.println(dan + "*" + num + "=" + dan * num);
			num +=1;
		}
			dan +=1;
	    }
	}
	public static void forstar() {
		for(int row =1; row<=6;row++) {
			for(int col =1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void whileStar() {
		int row =1, col;
		
		while(row <= 6) {
			col = 1;
			while(col <= row) {
			System.out.print("*");
			col += 1;
			}
			System.out.println();
			row += 1;
		}
		
	}
}

