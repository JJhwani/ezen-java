package com.ezen.ex1;

class Person{
	String name;
	int age;
	
	Person(){
		System.out.println("Person");
	}
}
//Student 클래스는 Person 클래스를 상속받았다.
class Student extends Person{
	String no;//학번
	String major;//전공
	
	Student(){
		System.out.println("Student");
	}
}


public class InheritanceEx0 {
	public static void main(String[] args) {
		Person 김대철 = new Person();
		김대철.name = "김대철";
		김대철.age = 53;
		System.out.println(김대철.name+", "+김대철.age);
		
		Student 백수민 = new Student();
		백수민.name = "백수민";
		백수민.age = 25;
		백수민.no = "5001";
		백수민.major = "java";
		System.out.println(백수민.name+", "+백수민.age+", "+백수민.no+", "+백수민.major);
		
	}
}

//class AlbaStudent extends Person{ //학생 중 학내에서 알바하는 친구
//	String no;//학번
//	String major;//전공
//	String job;
//}