package dev.kaldiroglu.fp.evenNumber.code

/**
 *
 * @author akin akin.kaldiroglu@javacodegeeks.com
 */
class EvenNumberCalculationsWithClosure {

	static main(args) {
		def obj = new EvenNumberCalculationsWithClosure()
		Closure closure = {print it + " " }
		obj.pickEvenNumbers1(10, closure)
		
		println()
		
		def total = 0
		obj.pickEvenNumbers1(10) { total += it }
		println('Total: ' + total)
		
		def product = 1
		obj.pickEvenNumbers1(10) { product *= it }
		println('Product: ' + product)
		
		def squared = []
		obj.pickEvenNumbers2(10) { squared << it * it }
		println('Squares: ' + squared)
	}

	def pickEvenNumbers1(n, block) {
		for(int i = 2; i <= n; i += 2) {
			block(i)
		}
	}
	
	def pickEvenNumbers2(n, Closure block) {
		for(int i = 2; i <= n; i += 2) {
			block(i)
		}
	}
}
