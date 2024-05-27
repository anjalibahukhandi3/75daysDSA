public class SumRecursion {
    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 10; // Example value
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum(n));
    }
}
