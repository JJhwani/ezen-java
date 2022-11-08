package com.ezen.ex01;

import java.util.*;

public class Ex1 {
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
		if(num>=50) {
			System.out.println("입력하신 정수는 50 이상입니다.");
		}
		else if(num<50) {
			System.out.println("입력하신 정수는 50 미만입니다.");
		}		
	}

}
