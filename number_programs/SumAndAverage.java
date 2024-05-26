package number_programs;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read 10 numbers from the keyboard
        int totalNumbers = 10;
        int sum = 0;

        for (int i = 1; i <= totalNumbers; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        // Calculate average
        double average = (double) sum / totalNumbers;

        // Display the sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
