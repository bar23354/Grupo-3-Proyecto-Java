
/** 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class leerCSV{
    public static String[] readCSV(String filePath) { // Esta función lee un archivo CSV y lo imprime en pantalla
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line of the CSV file here
                String[] data = line.split(",");

                // Do something with the data (e.g., print it)
                return data;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
/* */
import java.io.BufferedReader;
import java.io.FileReader;

public class leerCSV {
    public static void main(String[] args) {
        String csvFile = "./assets/Libro1.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[]
            }

        }
    }
}