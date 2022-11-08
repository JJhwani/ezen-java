package com.ezen.ex01;

import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		input();
	}
	public static void input(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		output(num);
	}
	public static void output(int num) {
		if(num%3==0) {
			System.out.println("입력하신 정수는 3의 배수입니다.");
		}
		else {
			System.out.println("입력하신 정수는 3의 배수가 아닙니다.");
		}		
	}
}