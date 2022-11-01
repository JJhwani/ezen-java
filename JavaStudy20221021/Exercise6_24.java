package com.ezen.ex1;

class Exercise6_24 {
	public static void main(String args[]) {
		int value = 5;
		System.out.println(value+"의 절대값:"+abs(value));
		value = -10;
		System.out.println(value+"의 절대값:"+abs(value));


	}
	static int abs(int value) {
//		int num = value;
//		return Math.abs(num);
//		
//		if(value<0) {
//			return value*-1;
//		}
//		else
//			return value;
		
		return (value >= 0) ? value:-value;
	}
}




