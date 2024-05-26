 //Krishnamurthy Number (also known as a Strong Number or Digital Factorial) is a number in which the sum of the factorial of its digits is equal to the number itself. 
package number_programs;
public class krishnamurthy{
    public static void main(String[] args){
       int number=141;
       int copy_number= number;
       int sum=0;
       int factorial=1;
       while(number>0)
       {
        int remainder=number%10;
        for(int i=1; i<remainder ; i++)
        {
            factorial=factorial*i;

        }
        sum=sum+factorial;
        number=number/10;
        factorial=1;
       }
       if (copy_number==sum)
       {System.out.println(copy_number+"is a krishnamurthy number");}
       else
       {System.out.println(copy_number+"is not a krishnamurthy number");}

    }

}