// write a program to sum any 20 numbers
// write a program to find largest number from given any 20 numbers using array

public class one {
    public static void main(String[] args) {
        int numbers [] = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int sum_result = 0;

        int i;
        for(i = 0; i<20; i++)
        sum_result = sum_result + numbers[i];

        System.out.println(" sum of 20 number is " + sum_result);
        
    }
    
}
 