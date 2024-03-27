package com.javaex.oop.person;

public class Student extends Person {
	
	private String school;

	
	// 생성자
	public Student(String school) {
		// 생성자 내에서 부모 생성자를 호출하지 않으면 부모의 기본 생성자를 호출
		super("Unkwown", 0);
		this.school = school;
	}
	
	public Student(String name, int age, String school) {
		super(name, age); // 부모 생성자 호출
		this.school = school;
	}
	
	// getters/setters
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	@Override  // 현재 메서드가 Override인지 확인
	public void showInfo() {
		// getter 이용 우회접근
//		System.out.printf("색깔점[x=%d, y=%d, color=%s] 점을 찍었습니다.%n", super.getX(), super.getY(), color);
		System.out.printf("이름=%s, 나이=%d, 학교=%s.%n", super.getName(), super.getAge(), school);
		
	}

}
