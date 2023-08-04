import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodigoConsiso {

    public static void main(String[] args) {
        String csvFile = "path/to/your/csvfile.csv"; // Replace this with the actual path to your CSV file

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String word = line.trim();
                if (isPalindrome(word)) {
                    System.out.println(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
//prueba