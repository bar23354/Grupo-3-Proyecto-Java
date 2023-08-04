import java.util.List;

public class Interfaz {
    public static void main(String[] args) {
        List<String> palindrome = ListString.getPalindromeList();

        for (String papaleta : palindrome) {
            System.out.println(papaleta);
        }
    }
}
