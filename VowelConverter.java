import java.util.Scanner;

public class VowelConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = input.replaceAll("[aeiouAEIOU]", "AEIOU");
        
        System.out.println("Modified string: " + result);
    }
}
