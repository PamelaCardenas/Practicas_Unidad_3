/*
 * Uso de datos multidimensionales, en este caso con cuatro dimensiones
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
        int aiMDatos[][][][] = new int[2][3][4][5]; //Creacion del arreglo con 4 dimensiones
        
        for (int i = 0; i < aiMDatos.length; i++) { //Recorre primera dimensión
            for (int j = 0; j < aiMDatos[i].length; j++) { //Recorre segunda dimensión
                for (int k = 0; k < aiMDatos[i][j].length; k++) { //Recorre tercera dimensión
                    for (int l = 0; l < aiMDatos[i][j][k].length; l++) { //Recorre ultima dimensión (Cuarta)
                        aiMDatos[i][j][k][l] = (int)(Math.random()*100); //Se llena el arreglo con números aleatorios
                    }
                }
            }
        }
        
        for (int i = 0; i < aiMDatos.length; i++) { //Primera dimensión
            for (int j = 0; j < aiMDatos[i].length; j++) { //Segunda dimensión
                for (int k = 0; k < aiMDatos[i][j].length; k++) { //Tercera dimensión
                    for (int l = 0; l < aiMDatos[i][j][k].length; l++) { //Cuarta dimensión
                        System.out.println(aiMDatos[i][j][k][l]); //Muestra los datos del arreglo
                    }
                }
            }
        }
        
    }
    
}
