package com.ezen.ex01;

import java.util.*;

public class Ex7 {
	//점수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램 작성
	//평균이 90점이상이면 A, 80점 이상이면 B, 70점이상이면 C, 60점이상이면 D, 나머지는 F
	public static void main(String[] args) {
		input();
	}
	public static void input() {
		Scanner sc = new Scanner (System.in);
		System.out.print("점수를 입력하세요. --> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
		output(num1, num2, num3);
	}
	public static void output(int num1, int num2, int num3) {
		int total=num1+num2+num3;
		double avg = total/3;
		String str = String.format("%.2f", avg);
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+str);
		
		if(avg>=90) {
			System.out.println("A학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점");
		}
		
	}
}