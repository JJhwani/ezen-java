package com.ezen.ex05;

class Box<T>{
	private T ob;
	public void set(T o) { ob=o; }
	public T get() { return ob; }
	@Override
	public String toString() {
		return ob.toString();
	}
	
}
class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}
	public static <T> void peekBox(Box<T> box) {
		System.out.println(box);
	}
}

public class WildCardUnboxer {
	public static void main(String[] args) {
		Box<String> box = new Box();
		box.set("Sweet");
		Unboxer.peekBox(box);
		
		Box<Integer> ibox = new Box();
		ibox.set(20);
		Unboxer.peekBox(ibox);
	}
}