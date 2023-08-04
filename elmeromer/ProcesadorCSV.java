package elmeromer;

import java.util.ArrayList;
import java.util.List;

//*Imprimir palabras palindromes*/
public class ProcesadorCSV {
    public static List<String> DoraExploradora(List<String> words) {
        List<String> PalabrasPali = new ArrayList<>();

        for (String word : words) {
            if (Interfaz.esPalindrome(word)) {
                PalabrasPali.add(word);
            }
        }

        return PalabrasPali;
    }

    public static void printPalindromes(List<String> PalabrasPali) {
        for (String word : PalabrasPali) {
            System.out.println(word);
        }
    }
}
