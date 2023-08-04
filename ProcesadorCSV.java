//Isa//
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CSVProcessor {
    public static void main(String[] args) {
        String inputFile = "ruta/al/archivo.csv";
        procesadorCSV(inputFile);
    }

    private static void procesadorCSV(String filePath) {
        Map<String, String> results = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String word = line.trim();
                boolean isPalindrome = PalindromeSi(word);
                
                if (isPalindrome) {
                    results.put(word, "es palindromo");
                } else {
                    results.put(word, "no es palindromo");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Map.Entry<String, String> entry : results.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean PalindromeSi(String word) {
        // Llama a tu función existente PalindromeSi aquí
        // Por ejemplo: return TuClase.PalindromeSi(word);
        return false; // Reemplaza con la llamada a tu función
    }
}

