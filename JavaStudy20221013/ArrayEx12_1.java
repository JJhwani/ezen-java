package ex1;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx12_1 {

	public static void main(String[] args) {
		
		String str = "201010-1234567";
		
		char ch = str.charAt(7);
		
		if(ch==1) {
			System.out.println("남");
		}
		else if(ch==2) {
			System.out.println("여");
		}
		
		System.out.println("==================================");
		
		String str2 = "abcdef";
		String tmp = str2.substring(2, 4);
		
		System.out.println(tmp);
		System.out.println(tmp.length());
		
		
		
	}

}
