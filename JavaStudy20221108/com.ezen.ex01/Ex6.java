package com.ezen.ex01;

import java.util.*;

public class Ex6 {
	public static void main(String[] args) {
		input();
	}
	public static void input() {
		Scanner sc = new Scanner (System.in);
		System.out.println("문자를 입력해주세요");
		String str = sc.nextLine();
		sc.close();
		System.out.println(str);
		
		output(str);
	}
	public static void output(String str) {
		int a = (int)(Math.random()*str.length());
		char ch = str.charAt(a);
		
		if(ch>=65 && ch<=90) {
			System.out.println((a+1)+"번째 문자는 대문자입니다.");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println((a+1)+"번째 문자는 소문자입니다.");
		}
		else {
			System.out.println("입력하신 문자는 알파벳이 아닙니다");
		}
	}
}