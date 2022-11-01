package ex1;

import java.util.Arrays;
import java.util.Random;

public class Array00 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		
		//배열 저장(random 이용. 1~100사이)
				
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100)+1;
		}
				
		//배열 출력
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]+",");
		}
		
		//배열 총합과 평균 구해서 출력
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		avg = sum/num.length;
			
		System.out.println("총합계 : "+sum);
		System.out.println("평 균 : "+avg);
		
		//최대값, 최소값 출력
		int max = num[0];
		int min = num[0];
		
		for(int i=1; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
			else if(num[i]<min) {
				min = num[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		System.out.println("\n==================");
		//작은순에서 큰순서대로 정렬(오름차순)
//		for(int i=0; i<num.length-2; i++) {
//			for(int j=0; j<num.length-1; j++) {
//				if(num[j]>num[j+1]) {
//					int tmp = num[j];
//					num[j] = num[j+1];
//					num[j+1] = tmp;
//					
//				}
//			}
//		}
//		for(int i=0; i<num.length; i++) {
//			System.out.print("["+num[i]+"] ");
//		}
		
//		Arrays.sort(num);
//		for(int i=0; i<num.length; i++) {
//			System.out.print("["+num[i]+"] ");
//		}
		
		for(int i=0; i<num.length-2; i++) {
			for(int j=0; j<num.length-1; j++){
				if(num[j]>num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.print("["+num[i]+"] ");
		}
		
	}

}
