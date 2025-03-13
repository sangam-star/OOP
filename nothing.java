
class complex{
    int a;
    int b;


    public complex(){
        // a=real;
        // b=imag;
        a= 20;
        b=40;
    }

    void print(){
        System.out.println("a: "+ a +" b: "+b);
        // System.out.println("Sum: " + (a + b));
        System.out.println("a + b = "   + ( a+b ));
    }



}




public class nothing {
    public static void main(String[] args) {
        complex c1 = new complex();
       
        c1.print();
        
    }
    
}
