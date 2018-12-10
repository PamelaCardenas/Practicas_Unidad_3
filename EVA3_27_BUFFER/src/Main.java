
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * Buffers se usan para los archivos de texto
 * Abrir archivo --> InputStream
 * Leer bytes --> InputStreamReader (Neceista argumento InputStream)
 * Convertir a texto -> BufferedReader (Necesita como argumento InputStreamReader)
 * Se encadenan
 * -------------------------------
 * InputStream
 * InputStreamWriter
 * BufferedWriter
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 1855338
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InputStream isAbrir = null; //Indica en donde esta el archivo --- Apertura
        InputStreamReader isLeer = null; //Lectura de bytes
        BufferedReader brTexto = null; //Imprimirse
        
        try {
            isAbrir = Files.newInputStream(Paths.get("C:/archivos/Pamela.txt")); //Busca el archivo
            isLeer = new InputStreamReader(isAbrir); //Leer archivo por bytes
            brTexto = new BufferedReader(isLeer); //Sirve para trabajarlo como archivo de texto
            
            String sLinea = brTexto.readLine(); //Leer línea por línea, Cuando llega al final es null
            while(sLinea != null){
                System.out.println(sLinea);
                sLinea = brTexto.readLine();
            }
            brTexto.close(); //Cierra el Buffer
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
