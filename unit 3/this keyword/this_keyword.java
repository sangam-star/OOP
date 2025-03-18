// package this keyword;

public class this_keyword {
    int a, b;

    public this_keyword(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void display() {
        System.out.println("a: " + this.a + ", b: " + this.b);
    }

    public static void main(String[] args) {
        this_keyword obj = new this_keyword(10, 20);
        obj.display();
    }
    
}


 

