package com.ezen.ex01;

public class Exam {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new SmartTv());
		b.buy(new SmartTv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new SmartPhone());
		b.buy(new SmartPhone());

		b.buy(new SmartTv());

		b.summary();

	}
}

class Product{
	int price;
	Product(int price){
		this.price = price;
	}
}
class SmartTv extends Product{
	SmartTv(){
		super(200);
	}
	public String toString() {
		return "Smart TV";
	}
}
class Computer extends Product{
	Computer(){
		super(150);
	}
	public String toString() {
		return "Computer";
	}
}
class SmartPhone extends Product{
	SmartPhone(){
		super(100);
	}
	public String toString() {
		return "Smart Phone";
	}
}

class Buyer{
	int money = 1000;
	Product[] cart = new Product[3];
	int i =0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 "+p+"을/를 살 수 없습니다.");
			return;
		}
		money -= p.price;
		add(p);
	}
	void add(Product p) {
		if(i==cart.length) {
			Product[] newCart = new Product[cart.length*2];
			for(int i=0; i<cart.length; i++) {
				newCart[i] = cart[i];
			}
			cart = newCart;
			cart[i] = p;
		}
		cart[i++] = p;
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) {
				break;
			}
			sum += cart[i].price;
			itemList += cart[i]+", ";
		}
		System.out.println("구입한 물건: "+itemList);
		System.out.println("사용한 금액: "+sum);
		System.out.println("남은  금액: "+money);
	}
}
