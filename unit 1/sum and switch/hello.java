

public class hello {
    public static void main(String[] args) {
        // Integer arithmetic
        System.out.println("Integer Arithmetic");
        byte var1 = 2;
        int var2 = var1 * 3;
        int var3 = var2 / 4;
        int var4 = var3 - var1;
        int var5 = -var4;
        System.out.println("a = " + var1);
        System.out.println("b = " + var2);
        System.out.println("c = " + var3);
        System.out.println("d = " + var4);
        System.out.println("e = " + var5);

        // Floating-point arithmetic
        System.out.println("\nFloating Point Arithmetic");
        double var6 = 2.0;
        double var8 = var6 * 3.0;
        double var10 = var8 / 4.0;
        double var12 = var10 - var1; // No need to cast var1 to double
        double var14 = -var12;
        System.out.println("da = " + var6);
        System.out.println("db = " + var8);
        System.out.println("dc = " + var10);
        System.out.println("dd = " + var12);
        System.out.println("de = " + var14);

        // Modulus operation
        byte var16 = 42;
        double var17 = 42.25;
        System.out.println("x mod 10 = " + var16 % 10);
        System.out.println("y mod 10 = " + var17 % 10.0);
    }
}
    

