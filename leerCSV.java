import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class leerCSV{
    public static void readCSV(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line of the CSV file here
                String[] data = line.split(",");
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String occupation = data[2];

                // Do something with the data (e.g., print it)
                System.out.println("Name: " + name + ", Age: " + age + ", Occupation: " + occupation);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}