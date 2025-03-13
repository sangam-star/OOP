

class Box {

    double width;
    double height;
    double depth;   
       
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h,double d){

        width = w;
        height = h;
        depth = d;
    }

    Box(){
        width = -1;
        height = -1;
        depth = -1;
}

Box  (double len){
    width =height = depth= len;
}

double volume(){
    return width* height*depth;
}
} 
public class practicce {
    public static void main(String[] args) {
        Box mybox1 = new Box (10,20,30);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);
        double vol; 
        vol = mybox1.volume();
        System.out.println("volume of mybox1 is" + vol);

        vol = mybox2.volume();
        System.out.println("volume of mybox2 is" + vol);
        vol = mycube.volume();
        System.out.println("volume of mycube is" + vol);   
        vol = myclone.volume();
        System.out.println("volume of my clone is" + vol); 
     } 
}
