package com.ezen.ex1;

class Cake{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake{
	public void yummy() {
		System.out.println("Yummy CheeseCake");
	}
}


public class Test01 {
	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		CheeseCake c2= new CheeseCake();
		Cake c3 = new Cake();
		
		c1.yummy(); //Yummy CheeseCake
		c2.yummy(); //Yummy CheeseCake
		c3.yummy();
	}

}