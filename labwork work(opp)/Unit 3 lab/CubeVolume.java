import java.util.Scanner;

class VolumeCalculator {
     
    public int volume(int side) {
        return side * side * side;
    }

     
    public double volume(double side) {
        return side * side * side;
    }
}

public class CubeVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VolumeCalculator vc = new VolumeCalculator();
        
        
        System.out.print("Enter the side length of the cube (int): ");
        int intSide = scanner.nextInt();
        System.out.println("Volume of cube (int): " + vc.volume(intSide));
        
           
        System.out.print("Enter the side length of the cube (double): ");
        double doubleSide = scanner.nextDouble();
        System.out.println("Volume of cube (double): " + vc.volume(doubleSide));
        
        scanner.close();
    }
}
