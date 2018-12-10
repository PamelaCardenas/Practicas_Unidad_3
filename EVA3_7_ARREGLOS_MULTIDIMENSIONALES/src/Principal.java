/*
 * Uso de arreglos bidimensionales
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
        int aiMatriz[][] = new int [3][3];
        
        for (int i = 0; i < 3; i++) { //Recorriendo las filas del arreglo
            for (int j = 0; j < 3; j++) { //Recorriendo las columnas del arreglo
                aiMatriz[i][j] = (int)(Math.random()*100); //Insertando numeros aleatorios
            }
        }
        System.out.println(aiMatriz); //Muestra la dirección de toda la matriz
        System.out.println(aiMatriz[0]); //Muestra otro arreglo
        System.out.println(aiMatriz[0][0]); //Muestra un valor

        for (int i = 0; i < aiMatriz.length; i++) { //Recorriendo las filas
            for (int j = 0; j < aiMatriz[i].length; j++) { //Recorriendo las columnas
                System.out.println(aiMatriz[i][j]); //Muestra los datos del arreglo
            }
        }
        
        System.out.println("USANDO FOR EACH");
        for (int[] is : aiMatriz) { //Filas
            for (int i : is) { //Columnas
                System.out.println(i); //Datos del arreglo
            }
        }
        
    }
    
}
