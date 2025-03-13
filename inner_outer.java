class outer{
    int outer_x = 100;

    void test (){
        Inner inner = new Inner();
        inner.display ();
    }

    class Inner{
        void display (){
            System.out.println("display : outer_x = " +outer_x);

        }
    }
}

public class inner_outer {
    public static void main(String[] args) {
        outer outer = new outer();
        outer.test();


    }
    
}
