package elmeromer;

import java.util.ArrayList;
import java.util.List;

//*Imprimir palabras palindromes*/
public class ProcesadorCSV {
    public static List<String> findPalindromes(List<String> words) {
        List<String> palindromeWords = new ArrayList<>();

        for (String word : words) {
            if (Interfaz.isPalindrome(word)) {
                palindromeWords.add(word);
            }
        }

        return palindromeWords;
    }

    public static void printPalindromes(List<String> palindromeWords) {
        for (String word : palindromeWords) {
            System.out.println(word);
        }
    }
}
