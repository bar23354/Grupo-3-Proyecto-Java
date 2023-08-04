package elmeromer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\RJBar\\OneDrive\\Documents\\GitHub\\Grupo-3-Proyecto-Java\\elmeromer\\ExampleCSV.csv";

        ;

        CSVReader csvReader = new CSVReader(csvFile);
        List<String> words = csvReader.readCSV();

        List<String> palindromeWords = PalindromeProcessor.findPalindromes(words);

        PalindromeProcessor.printPalindromes(palindromeWords);
    }
}
