package com.ezen.ex03;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {

	public static void main(String[] args) {
		String expressin = "x=100*(200+300)/2";
		StringTokenizer st = new StringTokenizer(expressin,"+-*/=()",true);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}
}
