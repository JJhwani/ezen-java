package com.ezen.ex06;

class Box<T>{
	private T ob;
	public void set(T o) { ob=o; }
	public T get() { return ob; }
	@Override
	public String toString() {
		return ob.toString();
	}
}
class Unboxer{ //상한제한 Number 이거나 Number 상속한 대상만 가능
	public static <T> void peekBox(Box<? extends Number> box) {
		System.out.println(box);
	}
}

public class WildCardUnboxer {
	public static void main(String[] args) {
		Box<Integer> iBox = new Box();
		iBox.set(20);
		Unboxer.peekBox(iBox);
		
		Box<Double> dBox = new Box();
		dBox.set(12.5);
		Unboxer.peekBox(dBox);
		
//		Box<Object> oBox = new Box();
//		oBox.set("Sweet");
//		Unboxer.peekBox(oBox);
	}
}