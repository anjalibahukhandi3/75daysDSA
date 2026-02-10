import java.util.Scanner;

public class sqaureofnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double result = square(number);
        System.out.println("The square of " + number + " is " + result);
        scanner.close();
    }

    public static double square(double num) {
        return num * num;
    }
}
