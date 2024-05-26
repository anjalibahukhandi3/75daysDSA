import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.next();
        int decimalNumber = binaryToDecimal(binaryNumber);
        System.out.println("The decimal equivalent of " + binaryNumber + " is " + decimalNumber);
        scanner.close();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += 1 << power;
            }
            power++;
        }
        return decimal;
    }

    @Override
    public String toString() {
        return "Main []";
    }
}