package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * IterationDemo class contains static method printNumbers to print list
 */
public class IterationDemo {

	public static void printNumbers() {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// method1 using Iterator interface and while loop
		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		// method 2 using Consumer interface
		MyConsumer<Integer> consumer = new MyConsumer<>();
		integers.forEach(consumer);

		// method 3 traversing with anonymous consumer interface
		integers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("Method 3: forEach anonymous class value : " + t);
			}
		});

		// method4: explicit lambda function
		Consumer<Integer> consumer1 = t -> {
			System.out.println("Method 4: forEach Lambda impl value " + t);
		};
		integers.forEach(consumer1);

		// method 5:implicit lambda function
		integers.forEach(t -> {
			System.out.println("Method5: forEach lambda imple value " + t);
		});

	}
}
