package com.ezen.ex1;

class Product{
	int price;
	int bonusPoint;
	
//	Product(){}
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){
		super(10000);
	}
	public String toString() {
		return "TV";
	}
}

public class Exercise7_5 {

	public static void main(String[] args) {
		Tv t = new Tv();
		System.out.println(t.price);
		System.out.println(t.bonusPoint);
	}

}