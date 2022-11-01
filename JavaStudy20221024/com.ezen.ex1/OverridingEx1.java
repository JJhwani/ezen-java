package com.ezen.ex1;

public class OverridingEx1 {

	public static void main(String[] args) {
		사람 임채리 = new 근로학생();
		//오버라이딩은 참조자료형 클래스를 접근 하는 것이 아니고
		//참조대상 클래스 접근한다.
		//사람 클래스 참조변수는 사람 클래스 안에 있는 자원 및 상속 받은 Object 클래스만 접근가능하다.
		//사람 클래스를 상속받은 학생, 근로학생 클래스 안 자원은 접근이 불가하다.
		//다만, 사람 클래스 안에 있는 메소드를 하위크랠스에서 재정의(Overriding)하면 그 메소드 자원은
		//접근이 가능하다.
		
		임채리.sleep();
		

	}

}


class 사람{
	String name;
	int age;
	void sleep(){
		System.out.println("사람은 잠잔다.");
	}
}

class 학생 extends 사람{
	String major; //전공
	void study(){ 
		System.out.println("학생은 공부하다.");
	}
	void sleep(){
		System.out.println("학생은 잠잔다.");
	}
}

class 근로학생 extends 학생{
	String job;
	void work(){
		System.out.println("근로학생은 일을 한다.");
	}
	//상위클래스인 사람에 sleep 매서드가 존재 : 오버라이딩
	@Override // 어노테이션
	void sleep(){
		super.sleep();
		System.out.println("근로학생은 잠잔다.");
	}
}