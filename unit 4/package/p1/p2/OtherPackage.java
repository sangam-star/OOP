package p2;

  class OtherPackage {

    OtherPackage() {
        
        p1.protection p = new p1.protection ();
        
        System.out.println("other package constructor");
        // System.out.println("n = " + p.n); // Error: n has package access in p1.protection
        // System.out.println("n_pri = " + p.n_pri); // Error: n_pri has private access in p1.protection
        // System.out.println("n_pro = " + p.n_pro); // Error: n_pro has protected access in p1.protection
        System.out.println("n_pub = " + p.n_pub);
    }
               
}

 
