package com.ezen.ex06;

public class PolymorphismEx01 {

	public static void main(String[] args) {
		
		Person p = new Person();
		p = new Student();
		
		//p = new WorkStudent();
		
		Student s = new Student();
		s = new WorkStudent();
		//s = new Person(); 하위클래스가 상위클래스 참조불가
		
		s=(Student)p;
		s.study();
		s.eat();
		
		WorkStudent ws = new WorkStudent();
		//ws = new Student(); //상위클래스
		//ws = new Person();  //상위클래스

	}

}

class Person{
	private String name;
	private int age;
	void eat() {
		System.out.println("사람은 일한다.");
	}
	//void run() {}
}

//사람 중 학생
class Student extends Person{ //학생
	void study() {
		System.out.println("공부한다.");
	}
}

//학생 중 근로학생
class WorkStudent extends Student{ //노동자
	void study() {
		System.out.println("일한다.");
	}
}