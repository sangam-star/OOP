package constructor; 

class Box {
    double width;
    double height;
    double depth;
Box(){
     width=10;
     height=5;
    depth=30; 
    }
    double volume() {
         
        return width*height*depth;
    }
} 
public class constructor {
    public static void main(String[] args) {
        Box mybox1=new Box();
        Box mybox2=new Box(); 
        double vol; 
        vol=mybox1.volume();
        System.out.println("Volume is " +vol);
        vol=mybox2.volume();
        System.out.println("Volume is " +vol);
    }
}
