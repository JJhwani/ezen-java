package com.ezen.ex1;

public class Exercise6_20 {

	static int[] shuffle(int[] dest) {

		for(int i =0; i<dest.length; i++) {
			int j=(int)(Math.random()*dest.length);
			int tmp = dest[i];
			dest[i] = dest[j];
			dest[j] = tmp;
		}
		return dest;
		
		
		
	}
	
	public static void main(String[] args) {
		
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}

