package com.functionalprogramming;

import java.util.List;

public class FunctionalProgramming {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");

		printWithFPWithFiltering(list);

	}

	// Standard OOP method
	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}

	// functional programming way
	// here a function is treated as a first class citizen
	private static void printWithFP(List<String> list) {
		// convert it to a stream and telling what to do forEach element
		list.stream().forEach(
				// a function is being passed to another function
				// this cannot be done in OOP
				element -> System.out.println(element));
	}

	private static void printWithFPWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
				.forEach(element -> System.out.println("element - " + element));
	}

}
