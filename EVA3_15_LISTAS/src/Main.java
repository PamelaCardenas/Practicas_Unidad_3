
import java.util.ArrayList;
import java.util.List;

/*
 * Uso de Listas 
 * Sirven para guardar cualquier tipo de dato u objeto
 * No pueden modificar su tamaño
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
        List <Integer>lsMiLista = new ArrayList(); //Creación de una lista
        
        //Asignan valores a la lista
        lsMiLista.add(100);
        lsMiLista.add(500);
        lsMiLista.add(600);
        lsMiLista.add(700);
        lsMiLista.add(90);
        //System.out.println(lsMiLista);
        
        for (int i = 0; i < lsMiLista.size(); i++) { //Se despliegan todos los valores de la lista por medio de un ciclo for
            System.out.println(lsMiLista.get(i));
        }
        
    }
    
}
