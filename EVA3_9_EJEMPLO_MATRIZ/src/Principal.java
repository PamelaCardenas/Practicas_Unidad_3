/*
 * Crear una matriz de dos dimensiones, llenado con datos aleatorios de 1 a 100
 * Mostrar y llenar usando una función
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
        int aiMatriz[][] = new int[5][5]; //Matriz Original
        
        //Llamar al método llenarMatriz e imprmirMatriz para llenar e imprmir la matriz original
        System.out.println("-----Original-----");
        llenarMatriz(aiMatriz);
        imprimirMatriz(aiMatriz);
        
        
        System.out.println("\n Matriz nueva de 10x10");
        int aiMatrizNueva[][] = new int[10][10]; //Nueva matriz de dos dimensiones con mayor tamaño
        //Llamando métodos
        llenarMatriz(aiMatrizNueva);
        imprimirMatriz(aiMatrizNueva);
    }
    
    //Función para llenar las matrices
    public static void llenarMatriz(int matriz[][]){
        //For anidados para llenar la matriz con valores aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //Llenado con valores aleatorios
                matriz[i][j] = (int)(Math.random()*100 + 1);
            }
        }
    }
    
    //Función para imprimir las matrices
    public static void imprimirMatriz(int matriz[][]){
        //for anidados para mostrar las matrices
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}

//Cuando se envían parámetros de las funciones se envían por dos formas
//Por valor(Copia) y por referencia(Dirección)