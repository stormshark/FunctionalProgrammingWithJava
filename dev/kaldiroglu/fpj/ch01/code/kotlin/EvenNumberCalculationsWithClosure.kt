package dev.kaldiroglu.fpj.ch01.code.kotlin

fun pickEvenNumbers(n: Int, block: (Int) -> Unit) {
    for (i in 2..n step 2)
        block(i)
}

fun main() {
    print("Numbers: ")
//    val printer: (Int) -> Unit = { print("$it ") }
    val printer: (Int) -> Unit = { print("$it ") }
    pickEvenNumbers(10, printer)
//    pickEvenNumbers(10) { print("$it ") }

    println()

    var total = 0
    val adder: (Int) -> Unit = { total += it }
    pickEvenNumbers(10, adder)
//    pickEvenNumbers(10) { total += it }
    println("Total: $total")

    var product = 1
//    val multiplier: (Int) -> Unit = { product *= it }
    pickEvenNumbers(10) { product *= it }
    println("Product: $product")

    val squared = mutableListOf<Int>()
//    val squarer: (Int) -> Unit = { squared.add(it * it) }
    pickEvenNumbers(10) { squared.add(it * it) }
    println("Squared: $squared")
}