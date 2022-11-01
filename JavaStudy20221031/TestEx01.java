package com.ezen.ex01;

//StringBuilder 클래스 이용하여
//990915-1012999 ---> 990915 1012999
public class TestEx01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("990915-1012999");
		System.out.println(sb);
		sb.replace(6, 7, " ");
		System.out.println(sb);
		
		System.out.println("----------------");
		String str = new String("990915-1012999");
		System.out.println(str);
		String str2 = str.replace("-", " ");
		System.out.println(str2);
	}
}
