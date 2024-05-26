import java.util.Arrays;

public class SeparateOddEven {

    public static void main(String[] args) {
        int[] inputNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] oddNumbers = getOddNumbers(inputNumbers);
        int[] evenNumbers = getEvenNumbers(inputNumbers);

        System.out.println("Odd Numbers: " + Arrays.toString(oddNumbers));
        System.out.println("Even Numbers: " + Arrays.toString(evenNumbers));
    } public static int[] getOddNumbers(int[] inputArray) {
        int countOdd = 0;
        for (int num : inputArray) {
            if (num % 2 != 0) {
                countOdd++;
            }
        }
        int[] oddNumbers = new int[countOdd];
        int index = 0;
        for (int num : inputArray) {
            if (num % 2 != 0) {
                oddNumbers[index++] = num;
            }
        }
        return oddNumbers;
    } public static int[] getEvenNumbers(int[] inputArray) {
        int countEven = 0;
         for (int num : inputArray) {
            if (num % 2 == 0) {
                countEven++;
            }
        }
        int[] evenNumbers = new int[countEven];
        int index = 0;
        for (int num : inputArray) {
            if (num % 2 == 0) {
                evenNumbers[index++] = num;
            }
        }

        return evenNumbers;
    }
}
