package dev.kaldiroglu.fp.evenNumber.solution;

import java.util.function.Consumer;

public class SolutionTest {

	static int total = 0;
	static int product = 1;
	static int[] squares;
	static int count;

	public static void main(String[] args) {
		solution1();
		solution2();
		solution4();
	}

	static void solution1() {
		EvenNumberProcessor printer1 = x -> System.out.print(x + " ");
		processEvenNumbers(10, printer1);

		System.out.println();

		EvenNumberProcessor printer2 = System.out::print;
		processEvenNumbers(10, printer2);

		System.out.println();

		EvenNumberProcessor sum = x -> total += x;
		processEvenNumbers(12, sum);
		System.out.println("Total: " + total);

		System.out.println();

		EvenNumberProcessor multiply = x -> product *= x;
		processEvenNumbers(10, multiply);
		System.out.println("Total: " + product);

		System.out.println();

		squares = new int[10];
		EvenNumberProcessor square = x -> {
			squares[count] = x * x;
			count++;
		};
		processEvenNumbers(10, square);
		System.out.println("Array: ");
		for (int i : squares)
			System.out.println(i);
	}

	static void solution2() {
		EvenNumberProcessor2 sum = x -> {
			int total = 0;
			for(int i = 0; i <= x; i += 2)
				total += i;
			return total;
		};
		int resultTotal = processEvenNumbers3(12, sum);
		System.out.println("Total: " + resultTotal);
	}
	
	static void solution4() {
		Consumer<Integer> adder = x -> total += x;
		processEvenNumbers4(12, adder);
		System.out.println("Total: " + total);
	}

	static void processEvenNumbers(int n, EvenNumberProcessor processor) {
		for (int i = 2; i <= n; i += 2)
			processor.process(i);
	}

	static int processEvenNumbers2(int n, EvenNumberProcessor2 processor) {
		int result = 0;
		for (int i = 2; i <= n; i += 2) {
			result = processor.process(i);
		}
		return result;
	}

	static int processEvenNumbers3(int n, EvenNumberProcessor2 processor) {
		int result = processor.process(n);
		return result;
	}
	
	static void processEvenNumbers4(int n, Consumer consumer) {
		for (int i = 2; i <= n; i += 2)
			consumer.accept(i);
	}
}
