//Fibonacci series

public class FibonacciSeries {
    // Using recursion for Fibonacci as per Functions notes.txt
    public static int fibonacci(int n) {
        // Base case
        if (n <= 1) {
            return n;
        }
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void printFibonacciSeries(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci series up to " + n + " terms: ");
        printFibonacciSeries(n);
    }
}


