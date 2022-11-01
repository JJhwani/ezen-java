package ex1;


public class FlowEx16_3 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i=0; i<5; i++) {
			for(int j=5; j>=0; j--) {
				if(j>i) {
					System.out.print(" ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
		
	}

}