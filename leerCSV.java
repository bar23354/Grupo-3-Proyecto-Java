import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class leerCSV{
    final LeerArchivo archivo = new LeerArchivo();
    final Scanner entrada = new Scanner(System.in);
    

    public leerCSV(){
        archivo.abrirArchivo("palabras.csv");
        archivo.leerRegistros();
        archivo.cerrarArchivo();
    }



}