package com.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		// numbers.stream().forEach(element -> System.out.println(element));

		// int sum = fpSum(numbers);

		// System.out.println(sum);

		// Print squares of first 10 numbers
		IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.println(e));

		// stream.map(e -> e * e).forEach(e -> System.out.println(e));
		// Map the list to LowerCase
		List.of("Apple", "Ant", "Bat").stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));

		// Print the length of each element
		// List.of("Apple", "Ant", "Bat").stream().forEach(e ->
		// System.out.println(e.length()));
		List.of("Apple", "Ant", "Bat").stream().map(e -> e.length()).forEach(e -> System.out.println(e));

	}

	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> {
			System.out.println(number1 + " " + number2);
			return number1 + number2;
		});
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number; // mutations
		}
		return sum;
	}

}
