/*
 * Ejemplo de como se pueden propagar los errores en este caso a través de distintos métodos
 * Cuando ocurre el error en C al realizar la división entre cero y al capturar el error
 * se propaga y llega hasta el término de los métoso, hasta el Main
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
        System.out.println("Inicia Main"); //Mensaje de inicio
        A(); //Llama a A
        System.out.println("Termina Main"); //Mensaje de termino
    }
    
    public static void A(){
        System.out.println("Inicia A"); //Mensaje de inicio
        B(); //Llama a B
        System.out.println("Termina A"); //Mensaje de termino
    }
    
     public static void B(){
        System.out.println("Inicia B"); //Mensaje de inicio
        C(); //Llama a C
        System.out.println("Termina B"); //Mensaje de termino
    }
      public static void C(){
        System.out.println("Inicia C"); //Mensaje de inicio
        try{ //Posible error en el siguiente comando
        int iDivi = 1/0; //Divisón entre cero
        }catch(ArithmeticException e ){ //Excepción aritmética por la división entre cero
            e.printStackTrace(); //Muestra el error
        }
        System.out.println("Termina C"); //Mensaje de termino
    }
}
