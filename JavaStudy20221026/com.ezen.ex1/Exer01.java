package com.ezen.ex01;

public class Exer01 {

	public static void main(String[] args) {
		//p 참조변수는 Student 클래스 안 study 메소드 접근 불가
		Person p = new Student(); 
		p.study();
		
		Person p2 = new Person();
		Student s1 = (Student)p;
	}

}

class Person{
	String name;
	String age;
		
	void eat() {
		System.out.println("먹는다.");
	}
	void study() {}
}

class Student extends Person{
	String major;
	String no;
	//오버라이딩
	void study() {
		System.out.println("공부한다.");
	}
}
