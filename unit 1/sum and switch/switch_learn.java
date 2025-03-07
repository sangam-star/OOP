public class switch_learn{
    public static void main(String args[]) {
        for (int day = 0; day < 7; day++) { // Declare a variable day
            
            switch (day) {
                case 0:
                    System.out.println("Day is Sunday");
                    break;
                case 1:
                    System.out.println("Day is Monday");
                    break;
                case 2:
                    System.out.println("Day is Tuesday");
                    break;
                case 3:
                    System.out.println("Day is Wednesday");
                    break;
                case 4:
                    System.out.println("Day is Thursday");
                    break;
                case 5:
                    System.out.println("Day is Friday");
                    break;
                case 6:
                    System.out.println("Day is Saturday");
                    break;
                default:
                    System.out.println("Day is invalid");
                    break;
            }
        }
        
    }
    
}