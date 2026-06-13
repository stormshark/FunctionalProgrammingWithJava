using System;

namespace FunctionalProgramming{
    public class EvenNumberOperations {
        static void Main(string[] args){
        
           Console.WriteLine("EvenNumberOperations");
           printEvenNumbers(10);

           Console.WriteLine();

           int result = calculateSumOfEvenNumbers(10);
           Console.WriteLine("Sum: " + result);

           Console.WriteLine();

           result = calculateProductOfEvenNumbers(10);
           Console.WriteLine("Product: " + result);

           Console.WriteLine();

           int[] squares = calculateSquareOfEvenNumbers(10);
           Console.Write("Squares: [ ");
           foreach (int i in squares)
               Console.Write(i + " ");
            Console.Write(" ]");              
        }

        static void printEvenNumbers(int n){
           for (int i = 2; i <= n; i += 2)
               Console.Write(i + " ");
           Console.WriteLine();
        }

        static int calculateSumOfEvenNumbers(int n){
           int sum = 0;
           for (int i = 2; i <= n; i += 2)
               sum += i;
           return sum;
        }

        static int calculateProductOfEvenNumbers(int n){
           int product = 1;
           for (int i = 2; i <= n; i += 2)
               product *= i;
           return product;
        }

        static int[] calculateSquareOfEvenNumbers(int n){
           int[] square = new int[5];
           for (int i = 2; i <= n; i += 2)
               square[i / 2 - 1] = i * i;
           return square;
        }
    }
}
