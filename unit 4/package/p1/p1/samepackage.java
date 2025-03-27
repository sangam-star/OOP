

package p1;

public class samepackage {
    samepackage() {
    protection p = new protection();
        System.out.println("samepackage constructor");
        System.out.println("n = " + p.n);
        // System.out.println("n_pri = " + p.n_pri); // Error: n_pri has private access in p1.protection
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
    
}
