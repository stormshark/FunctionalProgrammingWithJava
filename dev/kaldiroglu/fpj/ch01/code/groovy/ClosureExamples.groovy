package dev.kaldiroglu.fpj.ch01.code.groovy

class ClosureExamples {

	static main(args) {
		//				callSimpleClosures();
		//				callAClosure1();
		//				callAClosure2()
        //		        closureForCollections()
        //				callAMethod1();
        //				callAMethod2();
	}

	public static callSimpleClosures(){

		def aString = { "hello" }.call();

		println aString;

		{ it -> println it }.call(5);

		{ name -> println name }.call("Java");

		{double x, double y -> println Math.pow(x, y)}.call(2, 8);
	}

	def static callAClosure1(){
		def closure = { 10 }       // Defining a closure of value "10"
		println(closure.call())    // Will print out "10"
		assert closure() == 10     // Assertion holds true

		def b = closure instanceof Closure
		println(b)                 // Prints true

		closure = {double x, double y -> println Math.pow(x, y)}
		closure.call(2, 8);
		closure(2, 8);

		// closure("Heyyy, what's up?")	// groovy.lang.MissingMethodException: No signature of method
		// closure.call();	// groovy.lang.MissingMethodException: No signature of method
		// closure();	// groovy.lang.MissingMethodException: No signature of method
	}

	def static callAClosure2(){
		def closure3 = { println it }   // Defining a closure to print the passed parameter
		closure3.call(5)         		// Will print out "5"
		closure3.call(new String("I love Groovy!"))         		// Will print out "5"
		closure3.call() ;        		// Will print out "null"
		{ it -> println it }.call(5)    // Will print out "5"
	}

	/**
	 * This method shows how a closure is passed to a higher order method.
	 * @return
	 */
	def static closureForCollections(){
		def List numbers = [1, 2, 3, 5, 8, 13, 21]
		for(n in numbers)
			print n
		println("\nUsing closures")

		numbers.each {print it + ', '}

		println ""

		def found = numbers.find {it % 2 == 0}
		println(found)

		List foundNumbers = numbers.findAll {it % 2 == 0}
		println(foundNumbers)
	}

	def static callAMethod1(){

		def aClosure = { it -> println it }

		aMethod(10, aClosure);

		aMethod(10, { it -> println it })

		aMethod(10) { it -> println it }

		aMethod(23, aClosure);
	}

	def static aMethod(int i, closure){
		println"Here is the output of passed closure:"
		closure(i)
	}

	def static callAMethod2(){

		def aClosure = aMethodReturningAClosure()
		println aClosure(22)
	}

	def static Closure aMethodReturningAClosure(){
		def aClosure = { it -> it * it }
	}
}
