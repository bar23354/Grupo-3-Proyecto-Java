import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class leerCSV{
    public static List<String[]> readCSV(String filePath) {
        List<String[]> dataList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                dataList.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataList;
    }



}