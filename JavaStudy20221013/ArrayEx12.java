package ex1;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx12 {

	public static void main(String[] args) {
		
		String[] name1 = {"Kim","Yi","Kim"};
		
		System.out.println(name1[0]);
		System.out.println(name1[1]);
		System.out.println(name1[2]);
		
		System.out.println(name1[0]==name1[2]);
	
		String[] name2 = new String[3];
		name2[0] = new String("Kim");
		name2[1] = new String("Yi");
		name2[2] = new String("Kim");
		System.out.println(name2[0]==name2[2]);
		System.out.println(name2[0].equals(name2[2]));
	}

}
