public class duplicatearray {



    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {7, 7, 9, 2, 3, 7, 7, 6};
        int total = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    total++;
                    break; // Break to avoid counting the same duplicate multiple times
                }
            }
        }

        System.out.println("Total number of duplicate elements: " + total);
    }

    
}
