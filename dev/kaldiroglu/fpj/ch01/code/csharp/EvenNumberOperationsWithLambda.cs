using System;
namespace FunctionalProgramming{

    public class EvenNumberOperationsWithLambda{
        public delegate void EvenNumberOperation(int n);

        static void Main(string[] args){
            Console.WriteLine("EvenNumberOperationsWithLambda");

            Console.Write("\nNumbers: ");

            EvenNumberOperation print = x => Console.Write(x + " ");
            pickEvenNumber(10, print);

            Console.WriteLine("\n");

            int total = 0;
            //EvenNumberOperation add = x => total = total + x;
            pickEvenNumber(10, x => total = total + x);
            Console.WriteLine("Sum: " + total);

            Console.WriteLine();

            int product = 1;
            //EvenNumberOperation multiply = x => product = product * x;
            pickEvenNumber(10, x => product = product * x);
            Console.WriteLine("Product: " + product);

            Console.WriteLine();

            int[] squares = new int[5];
            EvenNumberOperation square = x => squares[x / 2 - 1] = x * x;
            pickEvenNumber(10, square);

            Console.Write("Squares: [ ");
            foreach (int i in squares)
                Console.Write(i + " ");
            Console.Write(" ]");
        }

        public static void pickEvenNumber(int n, EvenNumberOperation operation){
            for (int i = 2; i <= n; i += 2)
                operation.Invoke(i);
        }
    }
}
