package com.ezen.ex03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx2 {

	public static void main(String[] args) {
		
		//.com으로 된 이메일 주소를 찾아라
		String str = "sample@naver.com,test01@gmail.com,test02@ezen.co.kr,"
						+ "test03@hrd.go.kr,apple@apple.org";
		
		String regex = "([\\w]*@[\\w]*.com)";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
