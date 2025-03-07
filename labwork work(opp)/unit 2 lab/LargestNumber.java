import java.util.Scanner; 

public class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         
        //  Input the number of elements
        System.out.print("Enter the number of elements: ");
        int n = s .nextInt();
        
        int[] arr = new int[n]; 
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = s .nextInt();
        }
        
        //  largest number calculation
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        } 

    //    Output
        System.out.println("The largest number in the array is: " + max);
        
        s.close();
    }
}
