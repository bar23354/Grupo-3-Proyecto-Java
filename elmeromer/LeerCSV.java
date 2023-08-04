package elmeromer;

//*Librerias de Java sugeridas por ChatGPT (OpenAI 2023)*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerCSV {
    private String csvFile;

    public LeerCSV(String csvFile) {
        this.csvFile = csvFile;
    }

    public List<String> readCSV() {
        List<String> words = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return words;
    }
}
