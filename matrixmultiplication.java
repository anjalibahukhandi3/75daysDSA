import java.util.Scanner;

public class matrixmultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the order of the square matrices: ");
        int n = scanner.nextInt();

        int[][] matrix1 = inputMatrix(n, "first", scanner);
        int[][] matrix2 = inputMatrix(n, "second", scanner);

        int[][] result = multiplyMatrices(matrix1, matrix2);

        System.out.println("Resultant matrix after multiplication:");
        displayMatrix(result);

        scanner.close();
    }

    public static int[][] inputMatrix(int n, String name, Scanner scanner) {
        System.out.println("Enter the elements of the " + name + " matrix:");
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = scanner.nextInt();
        return matrix;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    result[i][j] += matrix1[i][k] * matrix2[k][j];

        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row)
                System.out.print(element + " ");
            System.out.println();
        }
    }
}
