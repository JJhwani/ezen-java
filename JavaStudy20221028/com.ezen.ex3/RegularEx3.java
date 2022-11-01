package com.ezen.ex03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {

	public static void main(String[] args) {
		
		String[] str = {"abcd12","123456","afdsaf","ko23ea","abcdef"};
				
		//String regex = "[^0-9]";
		String regex = "[^a-z]";
				
		for(String data:str) {
			System.out.printf("%s\t%s\n",data,data.replaceAll(regex, "*"));
		}
	}
}
