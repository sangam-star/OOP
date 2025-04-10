
// WAP TO READ A FILE AND PRINT ITS CONTENTS

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        String filePath = "example.txt";  // Replace with your file name

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);  // Print each line
            }

            br.close();  // Close the file
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            
        }
    }
} 