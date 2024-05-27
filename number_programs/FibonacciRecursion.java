public class FibonacciRecursion {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void printFibonacciSeries(int terms) {
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        int terms = 10; // Example value for the number of terms in the series
        System.out.print("Fibonacci series up to " + terms + " terms: ");
        printFibonacciSeries(terms);
    }
}
