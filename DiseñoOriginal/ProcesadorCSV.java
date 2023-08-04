//Isa//

import java.util.List;

public class ProcesadorCSV {
    
    private String filePath;

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void procesar() {
        Object filePath;
        if (filePath == null || ((String) filePath).isEmpty()) {
            System.out.println("La ruta del archivo no está especificada.");
            return;
        }

        try {
            List<String[]> csvDataList = leerCSV.readCSV(filePath);
            for (String[] data : csvDataList) {
                String palabra = data[0];
                boolean esPalindromo = PalindromeSi.esPalindromo(palabra);
                String resultado = palabra + " es palíndromo? " + esPalindromo;
                
            }
        } catch (Exception e) {
            System.out.println("Error al procesar el archivo CSV: " + e.getMessage());
        }
    }
}
