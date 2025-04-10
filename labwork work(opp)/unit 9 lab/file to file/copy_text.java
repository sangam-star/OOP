

import java.io.*;
 
public class copy_text {
    public static void main(String[] args) {
        // Source file and destination file paths
        String sourceFile = "source.txt";  // Replace with your source file path
        String destinationFile = "destination.txt";  // Replace with your destination file path
        
        try {
            // Create BufferedReader to read the source file
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            
            // Create BufferedWriter to write to the destination file
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));
            
            String line;
            // Read each line from the source file and write it to the destination file
            while ((line = reader.readLine()) != null) {
                writer.write(line);  // Write the line to the destination file
                writer.newLine();  // Add a new line
            }
            
            // Close the reader and writer to release resources
            reader.close();
            writer.close();
            
            System.out.println("File copied successfully from source to destinstion.");
        } catch (IOException e) {
            System.out.println("An error occurred during file copy.");
            // e.printStackTrace();
        }
    }
}
