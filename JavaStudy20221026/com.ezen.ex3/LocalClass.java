package com.ezen.ex03;

interface Printerable{
	void print();
}

class Papers{
	private String con;
	
	public Papers(String s) {
		con = s;
	}
	
	public Printerable getPrinter() {
		
		class Printer implements Printerable{ //Printer 클래스 정의
			public void print() {
				System.out.println(con);
			}
		}
		return new Printer(); //Printer 클래스 생성
	}
}



public class LocalClass {

	public static void main(String[] args) {
		Papers p = new Papers("로컬 클래스 예제 테스트중입니다.");
		Printerable prn = p.getPrinter();
		prn.print();
	}

}
