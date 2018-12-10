
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * CREACIÓN Y LECTURA DE ARCHIVOS, CON 1 Y 0
 * File
 * FileInputStream
 * InputStreamReader
 * BufferedReader
 * 
 * BufferedWriter
 * OutputStreamWriter
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
        FileOutputStream fosEscribirArchivo = null;
        
        
        try {
            //CREAR
            fisLeerArchivo = new FileInputStream("C:/archivos/Imagen_1.bmp"); //SE ABRE EL ARCHIVO
            fosEscribirArchivo = new FileOutputStream("C:/archivos/copia.bmp"); //SE CREA EL ARCHIVO
            int iValor = fisLeerArchivo.read(); //LEE BYTE 
            
            while(iValor != -1){ //FIN DEL ARCHIVO
                //ESCRIBIR LO QUE LEEMOS EN EL OTRO ARCHIVO
                fosEscribirArchivo.write(iValor);
                iValor = fisLeerArchivo.read(); //LEER BYTE POR BYTE
            }
            fosEscribirArchivo.flush(); //GUARDA LOS CAMBIOS
            
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
            if(fosEscribirArchivo != null){ //SI EL ARCHIVO SI SE ESCRIBIÓ
                fosEscribirArchivo.close(); //CERRAR
            }
            }catch(IOException ex){ //POR SI NO SE LEE
             ex.printStackTrace();
            }
        }
    }
    
}
