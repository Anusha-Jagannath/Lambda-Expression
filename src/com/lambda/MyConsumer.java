package com.lambda;

import java.util.function.Consumer;

public class MyConsumer<T> implements Consumer<T> {

	@Override
	public void accept(T t) {
		System.out.println("Consumer implemented value : "+t);
	}

}
