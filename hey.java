class box{
    int a;
    int b;
    int c;
    box(int x, int y, int z){
        a = x;
        b = y;
        c = z;
    }
    int volume(){
        return a*b*c;
    }

 
}

public class hey {
    public static void main(String[] args) {
        box b = new box(10, 20, 30);
        System.out.println("Volume of box is " + b.volume());
    }
}