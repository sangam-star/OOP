


public class constructor  {
    public static void main(String[] args) {
    
    sangam s1 = new sangam( "sangam" , 30);
    sangam s2 = new sangam("sangam");
    sangam s3 = new sangam();

    s1.display();
     
     
    }
  }
  
  
class sangam{
  
    String name;
    int age;
      
    sangam(String name, int age){
      
        this.name = name;
        this.age = age;
      
          System.out.println( name + " "+ age); 



          
    }
    sangam(){
        System.out.println("Default constructor called");

    }

    // Constructor overloading
    sangam(String name){
        this.name = name;
        System.out.println("Name: " + name);
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}