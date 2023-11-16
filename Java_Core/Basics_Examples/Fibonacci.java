import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int count = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci series up to " + count + " terms:");
        for (int i = 0; i < count; i++) {
            System.out.print(calculateFibonacci(i) + " "); // calculating and printing the Fibonacci series
        }
    }

    public static int calculateFibonacci(int n) {
        if (n <= 1) {
            return n; // return the value 'n' for the base cases (0 and 1)
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2); // recursive calculation of Fibonacci numbers
        }
    }
}



/*

there are two ways to write the fibonacci series program in java 

    1-Fibonacci Series without using recursion
    2=Fibonacci Series using recursion
    
time complexity explanation for the given Fibonacci series code:
the code uses a recursive approach to compute Fibonacci numbers.
the time complexity of the recursive approach is exponential.
tor each call to the 'fibonacci(n)' method, it makes two recursive calls:
'fibonacci(n - 1)' and 'fibonacci(n - 2)' until reaching the base cases.
this creates a binary tree-like structure with 2^(n+1) - 1 nodes.
as a result the number of function calls grows exponentially with 'n' 
therefore the time complexity of this code is O(2^n) 
thich becomes inefficient for larger values of 'n' due to redundant computations
tor better efficiency iterative or memoization-based approaches
tith linear time complexity (O(n)) are preferred for computing the Fibonacci series.
*/
