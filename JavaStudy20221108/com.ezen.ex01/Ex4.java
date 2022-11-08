package com.ezen.ex01;

import java.util.*;

public class Ex4 {
	public static void main(String[] args) {
		input();
	}
	public static void input(){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		output(num1, num2, num3);
	}
	public static void output(int num1, int num2, int num3) {
		int[] arr = {num1,num2,num3};
		int max=arr[0];
		int min=arr[0];
		int sum;
		double avg;
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			else if(arr[i]>arr[i]) {
				min=arr[i];
			}
		}
		
		sum=num1+num2+num3;
		avg=(double)(num1+num2+num3)/3;
		String str = String.format("%.2f", avg);
		
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		System.out.println("합 계 : "+sum);
		System.out.println("평 균 : "+str);		
	}
}
