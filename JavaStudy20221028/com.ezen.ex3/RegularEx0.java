package com.ezen.ex03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		Pattern p = Pattern.compile("^[0-9]*$");
		Matcher m  = p.matcher(str);
		sc.close();
		
		if(m.find()==true) {
			System.out.println("영문자 구성");
		}
		else {
			System.out.println("다른 문자...");
		}
	}
}
