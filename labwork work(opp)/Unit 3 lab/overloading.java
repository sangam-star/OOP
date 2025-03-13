class Sum {
     
    void sum(int a, int b, int c) {
        System.out.println("a + b + c: " + (a + b + c));
    }

     
    void sum() {
        System.out.println("No parameters");
    }

     
    void sum(int a, int b) {
        System.out.println("a + b: " + (a + b));
    }

    
    void sum(String str1, String str2) {
        System.out.println(" String: " + str1 + str2);
    }
}

public class overloading {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.sum(10, 20, 30);  
        obj.sum();              
        obj.sum(10, 20);        
        obj.sum("sangam, ", "sedai");  
    }
}
