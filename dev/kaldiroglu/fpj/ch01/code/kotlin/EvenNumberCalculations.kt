package dev.kaldiroglu.fpj.ch01.code.kotlin

fun printEvenNumbers(n: Int) {
    print("Numbers: ")
    for (i in 2..n step 2)
        print("$i ")
    println()
}

fun calculateSumOfEvenNumbers(n: Int): Int {
    var sum = 0
    for (i in 2..n step 2)
        sum += i
    return sum
}

fun calculateProductOfEvenNumbers(n: Int): Int {
    var product = 1
    for (i in 2..n step 2)
        product *= i
    return product
}

fun calculateSquareOfEvenNumbers(n: Int): List<Int> {
    val square = mutableListOf<Int>()
    for (i in 2..n step 2)
        square.add(i * i)
    return square
}

fun main() {
    printEvenNumbers(10)
    println("Sum: ${calculateSumOfEvenNumbers(10)}")
    println("Product: ${calculateProductOfEvenNumbers(10)}")
    println("Squares: ${calculateSquareOfEvenNumbers(10)}")
}
