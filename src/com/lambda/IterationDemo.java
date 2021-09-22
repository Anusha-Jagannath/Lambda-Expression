package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
	}
}
