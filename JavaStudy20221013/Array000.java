package ex1;

import java.util.Arrays;
import java.util.Random;

public class Array000 {

	public static void main(String[] args) {
		
		int[] num = {10,20,30,40,50};
		
		System.out.println(Arrays.toString(num));
		System.out.println(num.length);
		
//		int[] DestNum = new int[10];
		int[] DestNum = new int[num.length*2];          //배열 확장
		
		//num배열을 DestNum배열로 복수
		for(int i=0; i<num.length; i++) {
			DestNum[i] = num[i];
		}
		
		//배열 index 5부터 9까지 변화		
		for(int i=num.length; i<DestNum.length; i++) {
			DestNum[i] = 10*(i+1); //60,70,80,90,10
		}
		System.out.println(Arrays.toString(DestNum));
		System.out.println("==========================================");
		
		int[] num2 = new int[num.length*2];
		
		System.arraycopy(num, 0, num2, 0, num.length);
		System.out.println(Arrays.toString(num2));
		
		
	}

}
