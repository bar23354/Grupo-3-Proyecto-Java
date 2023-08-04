//Lopez

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {
    private String filePath;

    public WritetoFile(String filePath) {
        this.filePath = filePath;
    }

    public void writeStringToCsv(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
            System.out.println("El archivo CSV se ha creado y guardado exitosamente.");
    }

    public static void main(String[] args) {
        String dataToWrite = "Hola,este es un ejemplo de texto que se escribirá en el CSV.";
        CsvWriter csvWriter = new CsvWriter("ruta/del/archivo.csv"); // Reemplaza "ruta/del/archivo.csv" por la ruta deseada
        csvWriter.writeStringToCsv(dataToWrite);
    }
}