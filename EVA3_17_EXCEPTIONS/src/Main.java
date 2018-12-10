
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * División de dos números empleando el uso del try - catch para generar excepciones en posibles errores
 */

/**
 *
 * @author  Karla Pamela Cárdenas Leyva 18550338
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int iResu = 0;
        
        try{ //Posible error en el comando siguiente
        //se agregan los valores
        System.out.println("Divisor: ");
        int divi = input.nextInt();
        System.out.println("Dividendo: ");
        int dividendo = input.nextInt();
        
            System.out.println("Error de captura: "); //Mensaje
            int iVal = input.nextInt(); //Solicita un número entero
            iResu = dividendo / divi;  //División
            
        }catch(ArithmeticException e){ //Excepción por si se divide entre cero
            System.out.println("El divisor es CERO, no se puede realizar la división"); //Muestra mensaje
        }catch(InputMismatchException e){ //Excepción por si introduce un valor que no es entero
            System.out.println("El valor agregado no es un número válido"); //Mensaje
        }
        System.out.println("Resultado = " + iResu); //Muestra resultado
    }
    
}
