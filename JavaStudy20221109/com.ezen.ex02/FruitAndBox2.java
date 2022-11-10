package com.ezen.ex02;

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

class Box{
	private Object ap;
	void set(Object a) {
		ap=a;
	}
	Object get() {
		return ap;
	}
}

public class FruitAndBox2 {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.set(new Apple());
		Apple ap = (Apple)box.get();
		System.out.println(ap);
		
		box.set(new Orange());
		Orange or = (Orange)box.get();
		System.out.println(or);
		
//		aBox.set(new Apple());
//		oBox.set(new Orange());
//		
//		Apple a = aBox.get();
//		System.out.println(a);
//		
//		Orange o = oBox.get();
//		System.out.println(o);
	}

}
