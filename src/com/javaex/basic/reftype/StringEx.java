package com.javaex.basic.reftype;

public class StringEx {

	public static void main(String[] args) {
		String str1; // 선언
		str1 = "Java"; // 할당
		String str2 = "Java"; // 선언과 동시에 할당
		String str3 = new String("Java");
		
		// 세 참조 변수는 같은 값을 가지고 있다
		// 참조 변수의 경우 ==은 메모리 주소의 비교
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		
		//값의 비교는 .equals 에서도 활용
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		

	}

}
