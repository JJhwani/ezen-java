package com.ezen.ex01;

import java.util.*;

public class Ex3 {
	public static void main(String[] args) {
		input();
	}
	public static void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("학년을 입력해 주세요. 예)1~4학년 >> ");
		int grade = sc.nextInt();
		System.out.print("점수를 입력해 주세요. >> ");
		int score = sc.nextInt();
		System.out.println();

		output(grade, score);
	}
	public static void output(int grade, int score) {
		if(score<0 || score>100) {
			System.out.println("점수는 0~100 사이 입력");
		}
		else if (grade==4 && score>=70) {
			System.out.println("합격입니다.");
		}
		else if (grade<4 && score>=60) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("정신차리자");
		}
	}
	
}
