/*
 * Ejemplo de arreglos: Son inmutables, no se les puede cambiar su tamaño
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
        //Arreglo con los días de la semana
        String[] asDias = {"Lunes", "Martes", "Miercoles", 
            "Jueves", "Viernes", "Sabado", "Domingo"};
        
        for (String asDia : asDias) { //Se muestra cada dia guardado en el arreglo
            System.out.println(asDia);
        }
        
        asDias = new String[5]; //Intento de disminuir el tamaño del arreglo
        for (String asDia : asDias) { //Muestra los datos del arreglo pero da error
            System.out.println(asDia);
        }
    }
    
}
