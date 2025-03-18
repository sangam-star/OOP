// package unit 3.argument_In_methods;

// In this code, we are passing the value of a and b to the method meth.

class test{  //
    void meth(int i, int j){
        i *= 2;  
        j /= 2;   
    }
}


public class By_value {
    public static void main(String[] args) {
        test obj = new test();
        int a = 15, b = 20;
        System.out.println("a and b before call: " + a + " " + b);
        obj.meth(a, b);
        System.out.println("a and b after call: " + a + " " + b);
    }
    
}
