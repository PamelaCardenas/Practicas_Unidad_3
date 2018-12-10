/*
 * Capturar 10 nombres del teclado, junto con la edad
 * Imprimir los datos(nombre y edad) de las personas.
 * Mostrar la media de todas las edades
 * USANDO ARREGLOS
 */

import java.util.Scanner;

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
        Scanner s = new Scanner(System.in);
        int edad[] = new int[10]; //Arreglo entero para introducir edades
        String nombre[] = new String[10]; //Arreglo String para introducir nombres
        
        for (int i = 0; i < edad.length; i++) { //Ciclo for para recorrer el arreglo y llenarlo 
            System.out.println("Ingresa el nombre y la edad");
            nombre[i] = s.nextLine(); //Llenado del arreglo nombre
            edad[i] = s.nextInt(); //Llenado del arreglo edad
            s.nextLine();
        }
        
        int iSuma = 0;
        for (int i = 0; i < edad.length; i++) { //Ciclo for para recorrer el arreglo y mostrarlo
            iSuma += edad[i]; //Suma de las edades
            System.out.println("Nombre: " + nombre[i] + " Edad: " + edad[i]); //Muestra los datos del arreglo
            
        }
        
        System.out.println("Media de edades: " + (double) (iSuma/10)); //Promedio de las edades
        
    }
    
}

