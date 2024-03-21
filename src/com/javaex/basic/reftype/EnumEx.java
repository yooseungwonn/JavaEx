package com.javaex.basic.reftype;

public class EnumEx {
	// enum에서도 테스트
	public static void main(String[] args) {
		Week today = Week.WEDNESDAY;
		
		System.out.println(today);
		// today.name 열거 상수의 문자열 표현
		// today.ordinal 열거 상수의 열거 객체내 순서
		
		System.out.printf("Today is %s(%d)%n", today.name(), today.ordinal());
		
		String strweek = "FRIDAY";
		Week obj = Week.valueOf(strweek);
		System.out.printf("obj is %s(%d)%n", obj.name(), obj.ordinal());
		

	}

}
