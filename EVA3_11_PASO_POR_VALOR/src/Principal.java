/*
 * Se prueba que no se llama a la dirección de la variable para copiar los datos en el método
 * Solamente se realiza la función dentro del método y al volver al Main se deja de usar la variable 
 *  del método y se borran los datos
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int iVal=0; //Variable
        llenar(iVal); //Llama el método y se manda la variable
        System.out.println(iVal); //Imprime la variable
    }
    
    public static void llenar(int i){ //Método para llenar 
        i = (int) (Math.random()*100+1); //Número aleatorio
    }
}
