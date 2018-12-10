

/*
 * Uso de throws para una nueva excepción y continuar con la ejecución del programa
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
    System.out.println("Inicia Main");
        try {
            A();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Termina Main");
    }
    
    public static void A() throws Exception{
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");
    }
    
     public static void B() throws Exception{
        System.out.println("Inicia B");
        C();
        System.out.println("Termina B");
    }
      public static void C() throws Exception{
        System.out.println("Inicia C");
        
        throw new Exception("Ya valió!!");
    }
}