
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Uso de excepciones, try-catch
 * try -- para ejecutar comandos que tal vez podrían ocasionar error
 * catch -- alternativa para ejecutar si se comete un error en el try
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
        
        //USANDO EXCEPCIONES Y CICLOS, PREGUNTAR HASTA QUE SE 
        //CAPTUREN LOS VALORES VÁLIDOS Y EL DIVISOR NO SEA CERO
        int iResu = 0;
       
        while(true){ //Ciclo while
            Scanner input = new Scanner(System.in);
            try{ //Comandos que posiblemente den error
              
            //Asignan valores a las variables
            System.out.println("Divisor: ");
            int divi = input.nextInt();
            System.out.println("Dividendo: ");
            int dividendo = input.nextInt();
            iResu = dividendo/divi; //División
            break;
            
            }catch(InputMismatchException e){ //Excepcion por si se ingresan datos String en lugar de enteros
                System.out.println("Debe ingresar valores numéricos"); //Mensaje
                
            }catch(ArithmeticException e){ //Excepción por si el divisor es cero
                System.out.println("El divisor es CERO, no se puede realizar la division"); //Mensaje
            }
        }
        
        System.out.println("Resultado: " + iResu); //Imprime resultado
        
        
        
        //Mostrar resultado de la división
    }
    
}
