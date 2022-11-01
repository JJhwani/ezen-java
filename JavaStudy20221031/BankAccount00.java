package com.ezen.ex01;

class BankAccount{
	int balance = 0;
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int wihtdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액 : "+balance);
		return balance;
	}
}


class BankAccount00 {
	public static void main(String[] args) {
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		yoon.deposit(50000);
		park.deposit(30000);
		
		yoon.wihtdraw(20000);
		park.wihtdraw(20000);
		
		yoon.checkMyBalance();
		park.checkMyBalance();
	}

}
