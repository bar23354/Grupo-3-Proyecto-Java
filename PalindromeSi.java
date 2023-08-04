// Juan_cruz
public class PalindromeSi {
    public static boolean esPalindromo(String palabra) {
        // Eliminar espacios en blanco y convertir a minúsculas
        palabra = palabra.replaceAll("\\s+", "").toLowerCase();
        
        int longitud = palabra.length();
        
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        
        return true;
    }
}
