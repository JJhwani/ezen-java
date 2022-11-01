package ex1;

/*
break
*/
public class FlowEx30_1 {

	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i==j) {
					continue;
				}
				System.out.println(i+" * "+j+" = "+i*j);
				
			}
			System.out.println();
		}
	}

}