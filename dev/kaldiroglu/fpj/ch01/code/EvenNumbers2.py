# This version uses lambda expressions

from array import array
from functools import reduce

def pickEvenNumbers(n, operation):
    for i in range(2, n + 1, 2):
        operation(i)

# Printer — body is a single expression, so it drops straight into a lambda
print("Numbers", end=" ")
pickEvenNumbers(10, lambda k: print(k, end=" "))

# Squares — append() is an expression too, so this works as a lambda as-is
squares = array('i')
pickEvenNumbers(10, lambda k: squares.append(k * k))
print("\nSquares: [", *squares, "]")

# Sum and Product — these can't be lambdas in the same way (see note below),
# so the natural lambda form is a fold:
evens = range(2, 11, 2)
total   = reduce(lambda acc, k: acc + k, evens, 0)
product = reduce(lambda acc, k: acc * k, evens, 1)
print("Sum:", total)
print("Product:", product)