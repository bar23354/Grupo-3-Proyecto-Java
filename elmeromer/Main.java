package elmeromer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFile = "path/to/your/csvfile.csv"; // Replace this with the actual path to your CSV file

        CSVReader csvReader = new CSVReader(csvFile);
        List<String> words = csvReader.readCSV();

        List<String> palindromeWords = PalindromeProcessor.findPalindromes(words);

        PalindromeProcessor.printPalindromes(palindromeWords);
    }
}
