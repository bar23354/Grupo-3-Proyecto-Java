package elmeromer;

import java.util.List;
//*Abrir el CSV y leerlo*/
public class Main {
    public static void main(String[] args) {
        String csvFile = "./assets/Libro1.csv";

        ;

        LeerCSV csvReader = new LeerCSV(csvFile);
        List<String> words = csvReader.readCSV();

        List<String> PalabrasPali = ProcesadorCSV.DoraExploradora(words);

        ProcesadorCSV.printPalindromes(PalabrasPali);
    }
}
