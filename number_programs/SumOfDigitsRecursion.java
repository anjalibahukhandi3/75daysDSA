public class SumOfDigitsRecursion {
    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return (number % 10) + sumOfDigits(number / 10);
        }
    }

    public static void main(String[] args) {
        int number = 12345; // Example value
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}
