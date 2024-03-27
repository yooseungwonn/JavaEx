package com.javaex.oop.person;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		this.name = "Unkwown";
		this.age  = 0;
	}
	
	public Person(String name, int age) {
		super();
		this.name= name;
		this.age= age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void showInfo() {
		System.out.printf("이름: %s,  나이: %d%n",
				name, age);
	}

	

}
