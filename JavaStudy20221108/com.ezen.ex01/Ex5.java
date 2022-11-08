package com.ezen.ex01;

import java.util.*;

public class Ex5 {
	public static void main(String[] args) {
		//사용자로부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램 작성
		input();
	}
	public static void input() {
		Scanner sc = new Scanner (System.in);
		System.out.print("정수를 입력하세요. --> ");
		int num = sc.nextInt();
		sc.close();
		
		output(num);
	}
	public static void output(int num) {
		if(num>0) {
			System.out.println("입력하신 정수는 양수입니다.");
		}
		else if(num<0) {
			System.out.println("입력하신 정수는 음수입니다.");
		}
		else if(num==0) {
			System.out.println("입력하신 정수는 0입니다.");
		}
	}
}