from array import *

def pickEvenNumbers(n, operation):
    for i in range(2, n + 1, 2):
	       operation(i)

print("\nNumbers", end=" ")

# Printer
def printer(k):
    print(k, end=" "),

pickEvenNumbers(10, printer)
print


# Sum
def adder(k):
    global sum
    sum += k

a = adder
sum = 0
pickEvenNumbers(10, a)
print("\n\nSum: ", sum)
print

# Product
def multiplier(k):
    global product
    product *= k

product = 1
pickEvenNumbers(10, multiplier)
print("\nProduct: ", product)
print

# Squares
def square(k):
    global squares
    squares.append(k * k)

squares = array('i')
pickEvenNumbers(10, square)
print("\nSquares: [ ", end=""),
for i in squares:
    print(i, end=" "),
print("]"),

