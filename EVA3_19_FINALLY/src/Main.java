
import java.util.Scanner;

/*
 * División de dos numeros empleando excepciones y el FINALLY
 * 
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
        Scanner input = new Scanner(System.in);
        int iDendo, iDsor; //Variables
         //Asignación de valores a las variables
        System.out.println("Introduce el dividendo: ");
        iDendo = input.nextInt();
        System.out.println("Introduce el divisor: ");
        iDsor = input.nextInt();
        
        int iResu = 0;
        
        try{ //Comandos con posible error
        iResu = iDendo/iDsor;
        
        }catch(ArithmeticException e){ //Excepción aritmética por si el divisor es cero
            //SE PUEDEN GENERAR EXCEPCIONES
            e.printStackTrace(); //Muestra el error
            System.out.println("División entre cero"); //Mensaje
            
        }finally{ //SIEMPRE SE EJECUTA
            //SE PUEDEN GENERAR EXCEPCIONES
            //CERRAR ARCHIVOS, LIBERAR RECURSOS
            System.out.println("Bloque finally"); //Mensaje
        }
        
        System.out.println("Resultado = " + iResu); //Resultado
    }
    
}
