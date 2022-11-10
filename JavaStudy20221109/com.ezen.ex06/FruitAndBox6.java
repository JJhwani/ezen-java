package com.ezen.ex06;

interface Fruit{}
class Apple implements Fruit{
	@Override
	public String toString() {
		return "I am an Apple.";
	}
}
class Orange implements Fruit{
	@Override
	public String toString() {
		return "I am an Orange.";
	}
}
class Person{
	@Override
	public String toString() {
		return "사람이다.";
	}
}

class Box<T extends Fruit>{
	private T ap;
	void set(T a) {
		ap=a;
	}
	T get() {
		return ap;
	}
}

public class FruitAndBox6 {
	public static void main(String[] args) {
		
		Box<Apple> abox = new Box();		
		abox.set(new Apple());
		Apple ap = abox.get();
		System.out.println(ap);
		
		Box<Orange> obox = new Box();
		obox.set(new Orange());
		Orange or = obox.get();
		System.out.println(or);
		
//		Box<Person> pbox = new Box();
//		pbox.set(new Person());
//		Person p = pbox.get();
//		System.out.println(p);
		
	}

}
