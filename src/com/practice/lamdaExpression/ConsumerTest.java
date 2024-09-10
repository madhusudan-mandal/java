package com.practice.lamdaExpression;

import java.util.function.Consumer;
public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> cs = s -> System.out.println(s);
		cs.accept("This is test string");
	}

}
/*
 *Consumer is an Interface contains only single abstract method : accept()
 * interface Consumer<T>
 *  {
 *  	void accept(T t);
 *  }
 * Consumer didn't return anything.
 * We can chain Consumer using andThen() method.
 * */