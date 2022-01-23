package com.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}
}

class ForEach implements Consumer<Integer> {

	@Override
	public void accept(Integer integer) {
		System.out.println(integer);
	}
}

class NumberSquareMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer number) {
		return number * number;
	}

}

public class LambdaBehindTheScenesRunner {
	public static void main(String[] args) {
		List.of(23, 43, 34, 45, 36, 48).stream().filter(n -> n % 2 == 0).map(n -> n * n)
		.forEach(e -> System.out.println(e));

		List.of(23, 43, 34, 45, 36, 48).stream().filter(new EvenNumberPredicate()).map(new NumberSquareMapper())
		.forEach(new ForEach());

		// 3 of the most important Functional Interfaces
		// Function
		// Predicate
		// Consumer

		// Predicate looks at the input and returns true or false
		// Stream<T> filter(Predicate<? super T> predicate)
		// boolean test(T t);

		// Function takes in a value and returns a value
		// whereas the map takes in a stream and returns a stream back
		// <R> Stream<R> map(Function<? super T, ? extends R> mapper)
		// R apply(T t);

		// Consumer takes the input and consumes it
		// it doesn't return anything back
		// void forEach(Consumer<? super T> action);
		// void accept(T t);

	}
}
