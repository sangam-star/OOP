package practice;
public class continuelabel {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 10; i++) { // Outer loop
            for (int j = 0; j < 10; j++) { // Inner loop
                if (j > i) { 
                    System.out.println();
                    continue outer; // Skips remaining iterations of the outer loop and moves to next iteration
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}
