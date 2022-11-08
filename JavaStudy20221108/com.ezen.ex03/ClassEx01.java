package com.ezen.ex03;

import java.util.*;

class Student{
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {
		this(null,0,0,0);
	}
	public Student(String name, int kor, int eng, int math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	int sum() {
		return kor+eng+math;
	}
	double avg() {
		return (int)(sum()/3.0*100)/100.0;
	}
	@Override
	public String toString() {
		return name+" : "+kor+", "+eng+", "+math+", "+sum()+", "+avg();
	}
	
	
}
public class ClassEx01 {
	public static void main(String[] args) {
		ArrayList<Student> st = new ArrayList();
		
		st.add(new Student("이상호",80,85,83));
		st.add(new Student("이예찬",75,77,73));
		st.add(new Student("정재환",89,51,67));
		st.add(new Student("김윤아",85,89,83));
		st.add(new Student("이은혜",73,67,75));
		
		Iterator<Student> it = st.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
	}
}