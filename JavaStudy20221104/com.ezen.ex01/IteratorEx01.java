package com.ezen.ex01;

import java.util.*;

public class IteratorEx01 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Bot");
		list.add("Toy");
		
		Iterator<String> itr = list.iterator(); // 반복자 획득
		while(itr.hasNext()) {
			System.out.println(itr.next()+'\t');
		}
		System.out.println("------------------------");
	}

}
