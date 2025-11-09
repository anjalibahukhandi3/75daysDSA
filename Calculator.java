import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("first number ");
        int a=sc.nextInt();
        System.out.println("second number ");
        int b=sc.nextInt();
        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
 
        int Operation = sc.nextInt(); 
        
        
        switch(Operation){
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a/b);
            break;
            default:
            System.out.println("Invalid operation");
        }


        

    }
}