
 
class sum {
    void sum(int a, int b, int c){
        System.out.println("a + b +  c:  " + a + " " + b + " " + c);
    }
    void sum(){
        System.out.println( "No parameters");

    }

    void sum(int a ,int b){
        System.out.println("  a + b: "  + a + " " + b);

    }

}



public class overloading{
    public static void main(String[] args) {
        sum obj = new sum();
        obj.sum(10, 20, 30);
        obj.sum();
        obj.sum(10, 20);

        
    }
}