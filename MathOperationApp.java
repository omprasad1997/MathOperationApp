package com.blbz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MathOperationApp {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<Integer>();
		for(int i=1;i<5;i++) myList.add(i);
			
		Function<Integer,Double>toDoubleFunction = Integer::doubleValue;
		Predicate<Integer> isEvenFunction = n -> n%2 == 0;
		
		//Processing the stream
		myList.stream().forEach(n-> {
			System.out.println("Mth8: Stream forEach Values: "+ n);
		});
		
		//Processing the stream,Apply Operation on then
		//Store the result
		List<Double> streamList = myList.stream()
								  .filter(isEvenFunction)
								  .map(toDoubleFunction)
								  .collect(Collectors.toList());
		System.out.println("Mth9: Printing Double List: " +streamList);							   	
		
		//Find first even number
		Integer first = myList.stream()
				  		.filter(isEvenFunction)
				  		.peek(n->System.out.println("Peak Even Number: "+n))
				  		.findFirst()
				  		.orElse(null);
		System.out.println("Mth10: First Even: " +first);	
	
		//Minimum and Maximum Even numbers
		Integer min = myList.stream()
				.filter(isEvenFunction)
				.min((n1,n2)->n1-n2)
				.orElse(null);
		System.out.println("Mth11: Min Even: " + min);	
		
		Integer max = myList.stream()
				.filter(isEvenFunction)
				.max(Comparator.comparing(Integer::intValue))
				.orElse(null);
		System.out.println("Mth12: Max Even: " + max);
	}
}











