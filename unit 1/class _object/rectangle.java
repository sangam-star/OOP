
// just building simple class and object concept how it works

class Rec{

    int a = 20;
    int b = 30;

     public void area(){  // creating a method which calclate the area which is a * b.
        System.out.println("area: " +  a * b ); // here after the " " we should put value with + sign other wise java    doesnot understand.
     }
}

public class rectangle {
    public static void main(String[] args) {
        Rec r1 = new Rec ();

        r1.area();  //To call method we should add () at any cost.
 
    }
    
}
