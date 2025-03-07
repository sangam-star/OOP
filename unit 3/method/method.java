
// wap to find volume of box using method.
public class method { 
    static class Box {
        double height;
       double width;
       double depth;
    
       double volume(){
        //    System.out.print("volume is ");
        return width + height + depth;
       }
    }
    public static void main (String[]args){
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height= 6;
        mybox2.depth= 9;

        double vol1 = mybox1.volume();
         double vol2 =mybox2.volume();
         System.out.println(vol1);
         System.out.println(vol2);
         
 
    }
    }
    
    
    

