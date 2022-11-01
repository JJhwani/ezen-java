package com.ezen.ex01;

import java.util.Arrays;

public class ArrayUtils {

	public static void main(String[] args) {
		int[] ar1 = new int[10];
		int[] ar2 = new int[10];
		
		Arrays.fill(ar1, 7);                 //배열 ar1을 7로 초기화
		System.arraycopy(ar1, 0, ar2, 3, 4); //배열 ar1을 ar2로 부분 복사

		int[] ar3 = {1,2,3,4,5,6,7,8,9,0};
		System.arraycopy(ar1, 0, ar3, 3, 4);
		
		for(int i=0; i<ar1.length; i++) {
			System.out.print(ar1[i]+", ");
		}
		System.out.println();
		
		for(int i=0; i<ar2.length; i++) {
			System.out.print(ar2[i]+", ");
		}
		System.out.println();
		
		for(int i=0; i<ar3.length; i++) {
			System.out.print(ar3[i]+", ");
		}
	}

}
