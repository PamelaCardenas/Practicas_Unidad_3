
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Solicita la información del clima de una dirección web
 * de un servidor
 */

/**
 *
 * @author KArla Pamela Cárdenas Leyva 18550338
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            //CONEXIÓN
            //Dirección Web
            URL url = new URL("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
            //Conectarnos
            HttpURLConnection http = (HttpURLConnection)url.openConnection();
            
            if(http.getResponseCode() == HttpURLConnection.HTTP_OK){  //Si la conexión fue correcta continúa
                //LEER UN TEXTO:
                InputStream is = http.getInputStream(); //Abre el archivo
                InputStreamReader srLector = new InputStreamReader(is); //Lee el archivo byte por byte
                BufferedReader bLeer = new BufferedReader(srLector); //Trabaja el archivo como archivo de texto
                
                System.out.println(bLeer.readLine()); //Imprime la información
            }
            //LEER EL TEXTO QUE NOS MANDA
        } catch (MalformedURLException ex) { //Excepción por si la dirección esta mal
            ex.printStackTrace(); //Imprime error
        } catch (IOException ex) { //Por si no abre el archivo
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
