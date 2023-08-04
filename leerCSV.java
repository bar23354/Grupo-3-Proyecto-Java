<<<<<<< HEAD
import java.io.BufferedReader;
=======

/** 

import java.io.File;
import java.io.FileNotFoundException;
>>>>>>> 62dfa224aa9cf2f6f1d35db1e2546d671442d748
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class leerCSV{
    public static List<String[]> readCSV(String filePath) {
        List<String[]> dataList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                dataList.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataList;
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
                System.out.println(); /*nueva linea*/ 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}