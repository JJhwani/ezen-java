package ex1;


public class FlowEx17_1 {

	public static void main(String[] args) {
		
		int sum=0;		
		
		for(int i=1; i<=10; i++) {
			sum += i;	
		}
		System.out.println("for문 : "+sum);
		
		sum=0;
		int i = 1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("while문 : "+sum);
		
	}

}