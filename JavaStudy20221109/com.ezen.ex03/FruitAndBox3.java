package com.ezen.ex03;

class Apple{
	@Override
	public String toString() {
		return "I am an Apple.";
	}
}

class Orange{
	@Override
	public String toString() {
		return "I am an Orange.";
	}
}

class Box<T>{
	private T ap;
	void set(T a) {
		ap=a;
	}
	T get() {
		return ap;
	}
}

public class FruitAndBox3 {
	public static void main(String[] args) {
		
		Box<Apple> box = new Box();
		
		box.set(new Apple());
		Apple ap = box.get();
		System.out.println(ap);
		
		Box<Orange> obox = new Box();
		obox.set(new Orange());
		Orange or = obox.get();
		System.out.println(or);
		
	}

}
