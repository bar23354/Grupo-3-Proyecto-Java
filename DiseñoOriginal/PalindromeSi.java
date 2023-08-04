// Juan_cruz
public class PalindromeSi {

    public static boolean esPalindromo(String palabra) {
        // Eliminar espacios en blanco y convertir a minúsculas
        palabra = palabra.replaceAll("\\s+", "").toLowerCase();
        
        int longitud = palabra.length();
        
        // Iterar hasta la mitad de la longitud de la cadena
        for (int i = 0; i < longitud / 2; i++) {
            // Comparar el carácter actual con el carácter simétrico en la otra mitad
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return false; // Si los caracteres no coinciden, no es un palíndromo
            }
        }
        
        // Si no se encontraron discrepancias en la comparación, es un palíndromo
        return true;
    }
}

