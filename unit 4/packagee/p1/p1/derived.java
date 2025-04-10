package p1;
class derived extends protection {
    derived() {
        System.out.println("derived constructor");
        System.out.println("n = " + n);
        // System.out.println("n_pri = " + n_pri); // Error: n_pri has private access in p1.protection
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}