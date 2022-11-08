package com.ezen.ex5;

import java.util.*;

public class ArraySort implements Comparable{
	public static void main(String[] args) {
		int[] num = {1,5,3,2,4};
		String[] str = {"aa","ab","cd","bb","ac"};
		
		Arrays.sort(num);
		Arrays.sort(str);
		
		for(int n : num) {
			System.out.print(n+"\t");
		}
		System.out.println();
		
		for(String s : str) {
			System.out.print(s+"\t");
		}
		System.out.println();
		System.out.println("----------------------------------------");
		
		Integer[] num2 = {1,5,3,2,4};
		Arrays.sort(num2, new Desc());
		//Arrays.sort(str, new Desc());
		System.out.println(Arrays.toString(num2));
		//System.out.println(Arrays.toString(str));
		
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}

class Desc implements Comparator<Integer>{
	public int compare(Integer o1, Integer o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable ) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2)*-1;
		}
		return -1;
	}
}