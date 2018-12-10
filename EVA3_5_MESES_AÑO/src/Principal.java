/*
 * Usando arreglos, se muestran los meses del año
 */
import java.util.Scanner;
/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 */

//LOS ARREGLOS SON INMUTABLES (NO SE PUEDE CAMBIAR SU TAMAÑO)

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] asMeses = new String[12]; //Arreglo de una dimensión con tamaño 12
        //Asignan un mes para cada posicion del arreglo
        asMeses[0] = "Enero";
        asMeses[1] = "Febreo";
        asMeses[2] = "Marzo";
        asMeses[3] = "Abril";
        asMeses[4] = "Mayo";
        asMeses[5] = "Junio";
        asMeses[6] = "Julio";
        asMeses[7] = "Agosto";
        asMeses[8] = "Septiembre";
        asMeses[9] = "Octubre";
        asMeses[10] = "Noviembre";
        asMeses[11] = "Diciembre";
        
        //Otro arreglo con llenado de otra manera
        String[] asMeses2 = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
            "Julio", "Agosto", "Septiembre" ,"Octubre" , "Noviembre", "Diciembre"};
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el número de mes (1-12)");
        //RESTAMOS UNO PORQUE EN EL ARREGLO EMPEZAMOS EN CERO
        int iMes = input.nextInt()-1; //introduce el usuario un número
        
        System.out.println("El mes es: " + asMeses2[iMes]); //Se muestra el mes 
        
        
    }
    
}
