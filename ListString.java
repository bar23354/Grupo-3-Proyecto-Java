import java.util.ArrayList;
import java.util.List;

public class ListString {
    public static void main(String[] args) {
        List<String> palindrome = new ArrayList<>();

        // Adding some sample strings to the list
        palindrome.add("level");
        palindrome.add("radar");
        palindrome.add("deified");

        // Iterating over the list and printing each string
        for (String papaleta : palindrome) {
            System.out.println(papaleta);
        }
    }

    public static List<String> getPalindromeList() {
        return null;
    }
}
