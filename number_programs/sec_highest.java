public class sec_highest {
    public static void main(String[] args)
    {
        int arr[] = {-1, 5, 4, 9, -5, 2};
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max)
            {
                secondmax = arr[i];
            }
        }
    System.out.println("second highest number:"+secondmax);
    }
    
