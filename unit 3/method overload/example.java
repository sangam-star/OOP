// package method overload;

//Method Overloading: Different methods with the same name but different parameters.

public class example {
    public static void main(String[] args) {

        Greet obj = new Greet();
        obj.greeting();
        obj.greeting("sangam");
        obj.greeting("sangam", 5);
    }
        
}
    class Greet{
        void greeting (){
            System.out.println("Hello, good morning");
        }
        void greeting(String name){
            System.out.println(" Hello " +name+ ", good morning " +name);
        }
        void greeting(String name, int count){
            for (int i = 0; i < count; i++) {
                System.out.println("Hello, good morning "+name);
            }
            
    }
    
}

