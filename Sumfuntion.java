import java.util.Scanner;

public class Sumfuntion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = add(a, b);
//         System.out.println(sum);
//         sc.close();
//     }

//     public static int add(int x, int y) {
//         return x + y;
//     }
// }

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     int multiply = multiply(a, b);
//     System.out.println(multiply);
//     sc.close();
// }

// public static int multiply(int x, int y) {
//     return x * y;
// }
// }
public static void printFactorial(int n) {
    int factorial = 1;
    for (int i = 1; i <= n; i++) {
        factorial = factorial * i;
    }
    System.out.println(factorial);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printFactorial(n);
    sc.close();
}
}