/*
 * Uso de arreglos de una dimensión llenado con números aleatorios y mostrarlos
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
        int[] aiEnteros, x, y, z; //TODOS SON ARREGLOS
        int aiEnteros2[], a, b, c; //SOLO aiEnteros2 ES ARREGLO
        //ARREGLO PARA 10 ENTEROS
        aiEnteros = new int[10];
        System.out.println(aiEnteros); //DIRECCIÓN DE MEMORIA
        
        for (int i = 0; i < aiEnteros.length; i++) { //Ciclo for para llenar el arreglo
            aiEnteros[i] = (int) (Math.random()*100);
        }
        
        for (int i : aiEnteros) { //Ciclo for para mostrar los datos del arreglo
            System.out.println("Valor = " + i);
        }
    }
    
}
