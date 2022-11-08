package com.ezen.ex5;

import java.util.Arrays;

class Person implements Comparable{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age= age;
	}
	
	public String toString() {
		return name + "," + age;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		if(this.age > p.age)
			return 1;
		else if(this.age < p.age)
			return -1;
		else
			return 0;
	}
}

public class ArrayObjSort {
	public static void main(String[] args) {
		Person [] per = new Person[3];
		
		per[0] = new Person("강감찬", 50);
		per[1] = new Person("홍길동", 25);
		per[2] = new Person("성춘향", 20);
		
		Arrays.sort(per);
		
		for(Person p : per) {
			System.out.println(p + "\t");
		}
	}
}