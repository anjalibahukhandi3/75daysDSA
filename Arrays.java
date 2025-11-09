import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //for direct value store
        // int marks[]={98,97,95,93,91,89,88};

        //if want to take input from user
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt(); // number of elements
        // int[] marks = new int[n];
        //loop to take input
        // for (int i = 0; i < n; i++) {
        //     marks[i] = sc.nextInt();
        // }
        //output
        // for (int i = 0; i < n; i++) {
        //     System.out.println(marks[i]);
        // }

        
        
        // int marks[]=new int [7];
        // marks[0]=98;
        // marks[1]=97;
        // marks[2]=95;
        // marks[3]=93;
        // marks[4]=91;
        // marks[5]=89;
        // marks[6]=88;
        // //bad approch this
        // // System.out.println(marks[2]);
        // //use loop for output
        // for (int i=0;i<7;i++){
        //     System.out.println(marks[i]);
        // }

        // String name[]=new String[7];
        // Scanner sc=new Scanner(System.in);

        // // Take input for names
        // for (int i = 0; i < name.length; i++) {
        //     System.out.print("Enter name " + (i + 1) + ": ");
        //     name[i] = sc.nextLine();
        // }

        // // Output the names
        // System.out.println("Names entered:");
        // for (int i = 0; i < name.length; i++) {
        //     System.out.println(name[i]);
        // }


        // int number[]={3,5,7,9,11,13,15};
        // // Output the elements of the number array
        // for (int i = 0; i < number.length; i++) {
        //     System.out.println(number[i]);
        // }


        //max min in array
//         Scanner sc = new Scanner(System.in);
//         int abc = sc.nextInt();
//         int number[] = new int[abc];

//         for (int i = 0; i < abc; i++) {
//             number[i] = sc.nextInt();
//         }

//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//         for (int i = 0; i < number.length; i++) {
//             if (number[i] > max) {
//                 max = number[i];
//             }
//             if (number[i] < min) {
//                 min = number[i];
//             }
//         }

//         System.out.println("Maximum: " + max);
//         System.out.println("Minimum: " + min);
//         sc.close();
//     }
// }

Scanner sc = new Scanner(System.in);
        int abc = sc.nextInt();
        int number[] = new int[abc];
        
        