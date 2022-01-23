package com.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
		.forEach(s -> MethodReferencesRunner.print(s));

		// Method Reference is a shortcut to the function-based argument
		// Method References also make the code more readable
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
		// method references work on a method being called on an instance ex. .map
		// we know the method is a String
		.map(String::length)
		// method references can call static methods
		.forEach(MethodReferencesRunner::print);

		Integer max = List.of(23, 44, 67, 89, 68).stream().filter(e -> e % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2))
				.orElse(0);
		System.out.println(max);

		// Convert the max to Method References
		Integer max1 = List.of(23, 44, 67, 89, 68).stream().filter(MethodReferencesRunner::isEven)
				.max(Integer::compare).orElse(0);
		System.out.println(max1);
	}


}
