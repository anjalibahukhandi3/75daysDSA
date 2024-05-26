import java.util.Scanner;

public class transposematrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = inputMatrix(rows, columns, scanner);

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        int[][] transposeMatrix = transpose(matrix);
        System.out.println("Transpose Matrix:");
        displayMatrix(transposeMatrix);

        scanner.close();
    }

    public static int[][] inputMatrix(int rows, int columns, Scanner scanner) {
        System.out.println("Enter the elements of the matrix:");
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                matrix[i][j] = scanner.nextInt();
        return matrix;
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposeMatrix = new int[columns][rows];
        for (int i = 0; i < columns; i++)
            for (int j = 0; j < rows; j++)
                transposeMatrix[i][j] = matrix[j][i];
        return transposeMatrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row)
                System.out.print(element + " ");
            System.out.println();
        }
    }
}
