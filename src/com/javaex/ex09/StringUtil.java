package com.javaex.ex09;

public class StringUtil {

	public static void main(String[] args) {
		String str = "Superman Batman Spiderman";
		String result = str.replaceAll("\\s+","");
		System.out.println(result);

	}

}
