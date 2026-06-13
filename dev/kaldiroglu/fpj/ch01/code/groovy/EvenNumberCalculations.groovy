package dev.kaldiroglu.fpj.ch01.code.groovy

class EvenNumberCalculations {

	static main(args) {
		def obj = new EvenNumberCalculations()

		obj.printEvenNumbers(10)

		def result = obj.calculateSumOfEvenNumbers(10);
		println('Sum: ' + result)

		result = obj.calculateProductOfEvenNumbers(10);
		println('Product: ' + result)

		result = obj.calculateSquareOfEvenNumbers(10);
		println('Squares: ' + result)
	}

	def printEvenNumbers(int n){
		for(int i = 2; i <= n; i += 2) 
			print(i)
		println()
	}

	int calculateSumOfEvenNumbers(int n){
		def sum = 0;
		for(int i = 2; i <= n; i += 2)
			sum += i
		return sum;
	}

	int calculateProductOfEvenNumbers(int n){
		def product = 1;
		for(int i = 2; i <= n; i += 2)
			product *= i
		return product;
	}

	int[] calculateSquareOfEvenNumbers(int n){
		def square = []
		for(int i = 2; i <= n; i += 2)
			square << i ** 2
		return square;
	}
}
