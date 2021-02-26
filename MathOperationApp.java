package com.blbz;

import java.util.ArrayList;
import java.util.List;

public class MathOperationApp {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<Integer>();
		for(int i =0;i<5;i++) myList.add(i);

		myList.stream().forEach(n-> {
			System.out.println("Mth8: Stream forEach Values: "+ n);
		});
	}
}











