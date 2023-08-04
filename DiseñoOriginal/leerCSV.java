
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
import java.io.IOException;

public class leerCSV {
    public static void main(String[] args) {
        String csvFile = "./assets/Libro1.csv"; /*ubicar archivo csv*/
        String line;
        String csvSplitBy = ","; /*delimitado por comas*/

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                /*separa los campos*/
                String[] palabra = line.split(csvSplitBy);
                for (String word : palabra){
                    System.out.print(word + " ");
                }
                System.out.println(); /*nueva linea*/ */
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}