package test;

import java.util.Scanner;

/*
 * 키보드로 4000을 입력받는다. (4000초)
 * 사칙연산을 이용해서 시, 분, 초로 변경
 * 1시 6분 40초
 */

public class Exam05 {
	
	public static void main(String[] args) {

		//강사님꺼
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력하세요.");
		int time = sc.nextInt();
		sc.close();
		int hour = 0;
		int minute = 0;		
		int second = 0;
		
		second = time%60; //초
		minute = time/60; //분
		hour = minute/60; //시간
		minute = time%60; //분
		
		System.out.println("time :"+time);
		System.out.println(hour+"시 "+minute+"분 "+second+"초");
		
		//내꺼
		System.out.println("변환시키고 싶은 초를 입력하세요.");
				
		int t = sc.nextInt();
		
		int h = t/3600;
		int m = (t%3600)/60;
		int s = (t%3600)%60;
		
		System.out.println("입력하신 초는");
		System.out.println(h+"시간 "+m+"분 "+s+"초");
		
		int a = 1000000;
		
		int result1 = a*a/a;
		int result2 = a/a*a;
		int result3 = (int)((long)a*a/a);
		long result4 = (long)a*a/a;
		
		//int*int ==> int
		//long*int --> long*long --> long
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}
}
