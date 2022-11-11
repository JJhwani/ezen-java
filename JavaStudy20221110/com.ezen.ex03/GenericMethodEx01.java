package com.ezen.ex03;

class Box<T>{
	private T ob;
	public void set(T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}
}
class BoxFactory<T>{
	public static <T> T makeBox(Box<T> o){ //제네릭 메소드.
		Box<T> box = new Box<T>();
		return o.get();
	}
}

public class GenericMethodEx01 {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("Sweet");
		
		String str = BoxFactory.makeBox(box);
		System.out.println(str);
	}

}