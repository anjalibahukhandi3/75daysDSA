public class SquareNumber {
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int number = 8; 
        int result = square(number);
        System.out.println("The square of " + number + " is: " + result);
    }
}
