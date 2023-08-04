//Lopez

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {
    public static void main(String[] args) {
        String inputFilePath = "input.txt"; // Ruta del archivo de entrada
        String outputFilePath = "output.txt"; // Ruta del archivo de salida
        
        // Leer el archivo de entrada y escribir en el archivo de salida
        try {
            String content = writeFile(inputFilePath);
            writeFile(outputFilePath, content);
            System.out.println("Contenido del archivo leído y escrito en el nuevo archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Método para leer el contenido de un archivo
    public static String writefile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
    
    // Método para escribir contenido en un archivo
    public static void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(content);
        }
    }
}

