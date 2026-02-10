// Krishnamurthy Number (also known as a Strong Number or Digital Factorial) 
// is a number in which the sum of the factorial of its digits is equal to the number itself.

public class krishnamurthy {
    
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int number = 141;
        int copy_number = number;
        int sum = 0;
        
        while (number > 0) {
            int remainder = number % 10;
            sum = sum + factorial(remainder);
            number = number / 10;
        }
        
        if (copy_number == sum) {
            System.out.println(copy_number + " is a Krishnamurthy number");
        } else {
            System.out.println(copy_number + " is not a Krishnamurthy number");
        }
    }
}