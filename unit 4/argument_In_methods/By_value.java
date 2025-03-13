// package unit 4.argumentIn_methods;

class test{
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
