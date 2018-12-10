import java.util.Scanner;

/*
 * Uso de THROW para generar nuestras propias excepciones
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int iDendo, iDsor; //Variables
        //Asignan valores a las variables
        System.out.println("Introduce el dividendo: ");
        iDendo = input.nextInt();
        System.out.println("Introduce el divisor: ");
        iDsor = input.nextInt();
        
        if(iDsor == 0){ //Si el divisor es igual a cero
                //LANZAMOS NUESTRA PROPIA EXCEPCIÓN
                throw new Exception("Hola Mundo cruel!!");
        }
    }
    
}
