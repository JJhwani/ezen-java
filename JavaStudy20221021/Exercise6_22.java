package com.ezen.ex1;

class Exercise6_22 {
	public static void main(String args[]) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
//		str = null;
//		System.out.println(str+"는 숫자입니까? "+isNumber(str));
//		
		str = "1234ㅇ";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));

	}
	static boolean isNumber(String str) {
		
		if(str==null || str.equals("")) {
			return false;
		}
		
		for(int i=0; i<str.length(); i++) {
			char tmp = str.charAt(i);
			if(tmp<'0' || tmp>'0') {
				return false;
			}
		}
		return true;
		
//		boolean chk =false;
//		for(int i=0; i<str.length(); i++) {
//			char tmp = str.charAt(i);
//			if(tmp>='0' && tmp<='9') {
//				chk = true;
//			}
//			else {
//				chk = false;
//				break;
//			}
//		}
//		return chk;
	}	
}




