package com.javaex.basic.types;

public class IntLongEx {
	public static void main(String[] args) {
		int intvar1;
		int intvar2;
		
		intvar1=2024;
		//intvar2=1234567890123// out of range
		
		System.out.println(intvar1);
		//System.out.println(intvar2);// 초기화 필요
		
		//long 형 (8byte)
		long longvar1;
		long longvar2;
		
		longvar1=2024;
		longvar2=1234567890123L; //long 형 데이터 뒤에는 L를 붙인다
		
		System.out.println(longvar1);
		System.out.println(longvar2);
		
		long amount=100_000_000_000l;
		System.out.println(amount);
		
		// 진법표기 : 2진수, 8진수, 16진수
		int bin, oct, hex;
		bin =0b1100; //2진수;0b
		oct =072;    //8진수;0
		hex =0xFF;   //16진수   0x
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}

}
