import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Creación y lectura de archivos de texto byte por byte
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       FileInputStream fisLeerArchivo = null;
        
        
        try {
            //CREAR
            fisLeerArchivo = new FileInputStream("C:/archivos/Pamela.txt"); //SE ABRE EL ARCHIVO
            int iValor = fisLeerArchivo.read(); //LEE BYTE 
            
            while(iValor != -1){ //FIN DEL ARCHIVO
                //ESCRIBIR LO QUE LEEMOS EN EL OTRO ARCHIVO
                System.out.print("" + (char)iValor);
                iValor = fisLeerArchivo.read(); //LEER BYTE POR BYTE
            }
            
        } catch (FileNotFoundException ex) { //EXCEPCION POR SI NO SE ENCUENTRA EL ARCHIVO
            System.out.println("El archivo no existe");
            ex.printStackTrace();
        }catch(IOException ex){ //POR SI NO PUEDE LEER EL ARCHIVO
            ex.printStackTrace();
        }finally{
            //CERRAMOS LOS ARCHIVOS
            try{
            if(fisLeerArchivo != null){ //SI SE LEYÓ SI SE CREO
                fisLeerArchivo.close(); //CERRAR
            }
            }catch(IOException ex){ //POR SI NO SE LEE
             ex.printStackTrace();
            }
        }
    }
    
}
