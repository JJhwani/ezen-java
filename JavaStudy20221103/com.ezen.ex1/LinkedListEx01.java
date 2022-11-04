package com.ezen.ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx01 {
	public static void main(String[] args) {
		List<String> lists = new LinkedList<>();
		
		lists.add("Toy2");
		lists.add("Box2");
		lists.add("Robot2");
		
		for(String str:lists) {
			System.out.print(str+'\t');
		}
		System.out.println();
		
		lists.remove(0);
		for(int i=0; i<lists.size(); i++) {
			System.out.print(lists.get(i)+'\t');
		}
		System.out.println();
	}
}
