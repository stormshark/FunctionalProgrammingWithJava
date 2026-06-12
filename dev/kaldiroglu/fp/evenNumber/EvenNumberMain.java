package dev.kaldiroglu.fp.evenNumber;

public class EvenNumberMain {
	private int sum = 0;
	private int product = 1;
	private int[] squared = new int[5];

	void main() {
		EvenNumberMain enm = new EvenNumberMain();

		System.out.print("Numbers: ");
		EvenNumberOperation operation  = i -> System.out.print(i + " ");
		enm.doEvenNumberOperation(operation, 10);

		System.out.println("\n");

		operation = i -> enm.sum += i;
		enm.doEvenNumberOperation(operation, 10);
		System.out.println("Sum: " + enm.sum);

		System.out.println();

		operation = i -> enm.product *= i;
		enm.doEvenNumberOperation(operation, 10);
		System.out.println("Product: " + enm.product);

		System.out.print("\nSquares: ");

		operation = i -> enm.squared[i/2 - 1] = i * i;
		enm.doEvenNumberOperation(operation, 10);
		for(int j : enm.squared)
			System.out.print(j + " ");

		System.out.println();

	}

	public void doEvenNumberOperation(EvenNumberOperation operation, int n) {
		for(int i = 1; i <= n; i++)
			if(i % 2 == 0)
				operation.operate(i);
	}
}
