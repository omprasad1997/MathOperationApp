package com.blbz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Iterator;

public class MathOperationApp {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<Integer>();
		for(int i =0;i<5;i++) myList.add(i);

		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println("Mth1: Iterator Value ::"+i);

		}

		class MyConsumer implements Consumer<Integer>{
			public void accept(Integer t) {
				System.out.println("Mth2: Consumer impl Value ::"+t);}
		}
		MyConsumer action = new MyConsumer();
		myList.forEach(action);

		myList.forEach(new Consumer<Integer t>() {
			public void accept(Integer t) {
				System.out.println("Mth3:for Each anonyms class values::"+t);
			}
		});

		Consumer<Integer>myListAction = n->{
			System.out.println("Mth4: forEach Lamda imp Value::"+n);
		};
		myList.forEach(myListAction);

		myList.forEach(n->{
			System.out.println("Mth5: forEach Lamda imp Values::"+n);
		});
		
		Function<Integer,Double>doubleFunction = Integer::doubleValue;
		myList.forEach(n->{
			System.out.println("Mth6: forEach Lamda double Values::"+
					doubleFunction.apply(n));
		});
		
		Predicate<Integer> isEvenFunction = n -> n%2 == 0;
		myList.forEach(n->{
			System.out.println("Mth7: forEach Lamda double Values::"+n+
								"check for Even: " + isEvenFunction.test(n));
		});
		
	}
}











