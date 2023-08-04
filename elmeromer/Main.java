package elmeromer;

import java.util.List;
//*Abrir el CSV y leerlo*/
public class Main {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\RJBar\\OneDrive\\Documents\\GitHub\\Grupo-3-Proyecto-Java\\elmeromer\\ExampleCSV.csv";

        ;

        LeerCSV csvReader = new LeerCSV(csvFile);
        List<String> words = csvReader.readCSV();

        List<String> palindromeWords = ProcesadorCSV.findPalindromes(words);

        ProcesadorCSV.printPalindromes(palindromeWords);
    }
}
