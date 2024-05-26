import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        int length = findStringLength(inputString);
        System.out.println("Length of the string is: " + length);
        scanner.close();
    }

    public static int findStringLength(String str) {
        int length = 0;
        char[] charArray = str.toCharArray();
        for (@SuppressWarnings("unused") char ch : charArray) {
            length++;
        }
        return length;
    }
}
