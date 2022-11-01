package ex1;


public class FlowEx28_1 {

	public static void main(String[] args) {
		
//		int sum, i;
//		sum = 0;
//		i = 1;
//		
//		do {
//			sum += i;
//			i++;
//		}while(i<=10);
//			System.out.println("do : "+sum);
		
		for(int i=1; i<=100; i++) {
			System.out.printf("i=%d",i);
			int tmp =i;
			
			do {
				if(tmp%10%3==0 && tmp%10!=0) {
					System.out.print("짝");
				}
			}while((tmp/=10)!=0);
			
			System.out.println("");
		}
	}

}