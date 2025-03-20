// package unit 3.argumentIn_methods;

// package unit 4.argumentIn_methods;

class Test{
    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }
    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }
}



public class By_reference {
    public static void main(String[] args) {
        Test obj = new Test(15, 20);
        System.out.println("obj.a and obj.b before call: " + obj.a + " " + obj.b);
        obj.meth(obj);
        System.out.println("obj.a and obj.b after call: " + obj.a + " " + obj.b);
    }
    
}
