package dev.kaldiroglu.fpj.ch01.code.groovy

class EvenNumberCalculationsWithClosure {

	static main(args) {
		Closure closure = {print it + " " }
		pickEvenNumbers1(10, closure)
		
		println()
		
		def total = 0
		pickEvenNumbers1(10) { total += it }
		println('Total: ' + total)
		
		def product = 1
		pickEvenNumbers1(10) { product *= it }
		println('Product: ' + product)
		
		def squared = []
		pickEvenNumbers2(10) { squared << it * it }
		println('Squares: ' + squared)
	}

    static def pickEvenNumbers1(n, block) {
		for(int i = 2; i <= n; i += 2) {
			block(i)
		}
	}

    static def pickEvenNumbers2(n, Closure block) {
		for(int i = 2; i <= n; i += 2) {
			block(i)
		}
	}
}
