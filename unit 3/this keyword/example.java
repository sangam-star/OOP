class Person {
    String name;
    int age;
    
    Person(String name, int age) {                              //creating a constructor (same as class name)
        this.name = name;
        this.age = age;
    }
    
    void greet() {                                              //creating a method greet
        System.out.println("Hello, my name is " + this.name + " and I am " + this.age + " years old.");
    }
}

public class example {
    public static void main(String[] args) {
        Person person1 = new Person("Sangam", 19);
        person1.greet();                                       //calling the greet method 

        Person person2 = new Person("Raju", 25);
        person2.greet();                                         //calling the greet method  
    }
}
