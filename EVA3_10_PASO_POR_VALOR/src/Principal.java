/*
 * Crear un arreglo con cinco datos aleatorios, mostrando el llenado con una función
 * de valor por valor
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
        int aiArreglo[] = new int [5]; //Arreglo con tamaño 5
        llenar(aiArreglo); //Llamar a método para llenar
        for (int i = 0; i < aiArreglo.length; i++) { //Mostrar datos del arreglo
            System.out.println("[" + aiArreglo[i] + "]");
        }
        
    }
    
    public static void llenar(int aiArre[]){ //Método para llenar el arreglo
        for (int i = 0; i < aiArre.length; i++) {
            aiArre[i] = (int)(Math.random() * 100 + 1);
        }
    }
    
}
