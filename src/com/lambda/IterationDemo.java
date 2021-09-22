package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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

		// method 6: implicit lambda function to print double values
		Function<Integer, Double> doubleFunction = Integer::doubleValue;
		integers.forEach(n -> {
			System.out.println("Method5: forEach lambda double value :: " + doubleFunction.apply(n));
		});

		// method 7: Implicit lambda function to print even no
		Predicate<Integer> isEvenFunction = n -> n % 2 == 0;
		integers.forEach(n -> {
			System.out.println("Method5: forEach value of: " + n + " check for even: " + isEvenFunction.test(n));
		});

	}

}
