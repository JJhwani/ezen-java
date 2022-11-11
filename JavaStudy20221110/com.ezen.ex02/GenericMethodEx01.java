package com.ezen.ex02;

class Box<T>{
	private T ob;
	void set(T o) {
		ob=o;
	}
	T get() {
		return ob;
	}
}
class BoxFactory<T>{
	//           반환타입 함수명(매개변수)
	public static <T> Box<T> makeBox(T o){ //제네릭 메소드.
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
	}
}

public class GenericMethodEx01 {
	public static void main(String[] args) {
		
		Box<String> sBox = BoxFactory.makeBox("Sweet");
		//sBox = BoxFactroy.makeBox(12345);
		
		System.out.println(sBox.get());
		
		Box<Double> dBox = BoxFactory.makeBox(7.85);
		System.out.println(dBox);
	}

}