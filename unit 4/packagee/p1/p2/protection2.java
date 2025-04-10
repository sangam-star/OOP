package p2;

// public class protection2 {
    class protection2 extends p1.protection {
        protection2 () {
            System.out.println("derived other package constructor");
            // System.out.println("n = " + n); // Error: n has package access in p1.protection
            // System.out.println("n_pri = " + n_pri); // Error: n_pri has private access in p1.protection
            System.out.println("n_pro = " + n_pro);
            System.out.println("n_pub = " + n_pub);
        }
    }

    

