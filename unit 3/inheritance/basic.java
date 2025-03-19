// package unit 3.inheritance;

class Box{
    double width;
    double height;
    double depth;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth =  ob.depth;
    }
    
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    //default constructor
    Box (){
        width = -1;
        height =  -1;
        depth = -1;
    }

    Box (double len){
        width =height = depth =len;
    }

    double volume(){
        return width * height * depth;
    }
 

}

class Boxweight extends Box{
    double weight ;

    Boxweight(double w, double h, double d,double m){
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

public class basic {
    public static void main(String[] args) {
        Boxweight mybox1 = new Boxweight(10,20,30,40.2);
        Boxweight mybox2 = new Boxweight(2,3,4,0.0076);
        double vol ;

        vol= mybox1.volume();
        System.out.println("Volume of mybox1 is " +vol);
        System.out.println("Weight of mybox1 is "+mybox1.weight);

        System.out.println();

        vol = mybox2.volume();
        System.out.println("volume of mybox is " + vol);
        System.out.println("Weight of mybox1 is "+mybox2.weight); 

    }
 
}
