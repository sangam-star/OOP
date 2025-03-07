import java.util.Scanner; 
public class matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        // Taking matrix dimensions from user
        System.out.print("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = s.nextInt(); 
        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows]; 
        // Taking matrix input
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = s.nextInt();  
            }
        } 
        // Transposing the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        } 
        // Displaying transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        } 
        s.close();
    }
}
    

