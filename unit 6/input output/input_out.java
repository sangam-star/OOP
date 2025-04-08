
import java.io.*; 

 class input_out {
 
    public static void main(String[] args) throws IOException{ 

        
            char c;


            // BufferedReader is used to take input
            //This allows the program to read user input from the keyboard.

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println("enter the character, 'q' to quit.");


            do{
                c = (char) br.read();  // Reads one character from input
               
                 
                System.out.println(c); // Prints the character
            } while (c != 'q');  // Loop continues until 'q' is entered
          
                  
    }

}
    
    
         
        
        
        