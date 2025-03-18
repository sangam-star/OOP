// package returning object;

class Test{
    int a;

    Test(int i){
        a = i;
    }

    Test incrByTen(){
        Test temp = new Test(a + 10);
        return temp;
    }
}


public class Returning_obj {
    public static void main(String[] args) {
        Test obj1 = new Test(2);
        Test obj2;
        Test obj3;


        obj2 = obj1.incrByTen();
        System.out.println("obj1.a: " + obj1.a);
        System.out.println("obj2.a: " + obj2.a);

        obj2 = obj2.incrByTen();
        System.out.println("obj2.a after second increment: " + obj2.a);

        obj3 = obj2.incrByTen();
        System.out.println("obj3.a after third increment: " + obj3.a);
    }
    
}
