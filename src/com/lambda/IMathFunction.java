package com.lambda;

@FunctionalInterface
public interface IMathFunction {

	int calculate(int a, int b);

	/**
	 * method to compute print computed result
	 * 
	 * @param a        first operand
	 * @param b        second operand
	 * @param function indicates name of the operation
	 * @param obj      indicates object for specific operation
	 */
	static void print(int a, int b, String function, IMathFunction obj) {
		System.out.println("Result of " + function + " is : " + obj.calculate(a, b));
	}

}
