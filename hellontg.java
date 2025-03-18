
// // class box{
// //     int width;
// //     int height;
// //     int depth;
     
// //     void volume(){
// //         System.out.println("Volume is " + width * height * depth);
// //     }
// // }

// // public class hellontg {
// //     public static void main(String[] args) {
// //         box b1 = new box();
// //         box b2 = new box();
// //         // int vol1, vol2;
// //         b1.width = 10;
// //         b1.height = 20;
// //         b1.depth = 30;
// //         b2.width = 40;
// //         b2.height = 50;
// //         b2.depth = 60;
// //         b1.volume();
// //         b2.volume();

// //         // vol1 = b1.width * b1.height * b1.depth;
// //         // vol2 = b2.width * b2.height * b2.depth;
// //         // System.out.println("Volume of box 1 is " + vol1);
// //         // System.out.println("Volume of box 2 is " + vol2);
// //     }
    
// // }


// class Add {
//     int a;
//     int b;

//     // Constructor 1: No parameters
//     public Add() {
//         this.a = 0;
//         this.b = 0;
//     }

//     // Constructor 2: One parameter
//     public Add(int a) {
//         this.a = a;
//         this.b = 0;
//     }

//     // Constructor 3: Two parameters
//     public Add(int a, int b) {
//         this.a = a;
//         this.b = b;
//     }

//     void add() {
//         System.out.println("Sum: " + (a + b));
//     }
// }

// public class hellontg {
//     public static void main(String[] args) {
//         Add obj1 = new Add();          // Calls constructor with no parameters
//         Add obj2 = new Add(10);        // Calls constructor with one parameter
//         Add obj3 = new Add(10, 20);    // Calls constructor with two parameters

//         obj1.add();
//         obj2.add();
//         obj3.add();
//     }
// }


class Multiply {
    int a;
    int b;

    // Method 1: No parameters
    void multiply() {
        System.out.println("Product: " + (a * b));
    }

    // Method 2: One parameter
    void multiply(int a) {
        System.out.println("Product: " + (a * this.b));
    }

    // Method 3: Two parameters
    void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }
}

public class hellontg {
    public static void main(String[] args) {
        Multiply obj = new Multiply();
        obj.a = 5;
        obj.b = 10;

        obj.multiply();          // Calls method with no parameters
        obj.multiply(2);         // Calls method with one parameter
        obj.multiply(3, 4);      // Calls method with two parameters
    }
}