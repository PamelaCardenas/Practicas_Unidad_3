
import java.lang.reflect.Array;

/*
 * Uso de arreglos simulando una lista y usando tipos de datos genéricos
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
        CasiLista[] aArregloLista = new CasiLista[10]; //Creación de la lista
        
        for (int i = 0; i < aArregloLista.length; i++) { //Recorre la lista
         aArregloLista[i] = new CasiLista<Integer>();   //Se le indica que tendrá valores enteros
        }
        
        aArregloLista[0].setDato(100); //Se le asigna el valor
        System.out.println(aArregloLista[0].getDato()); //Muestra el valor
        
        
    }
    
}

class CasiLista<T>{ //Clase lista a la que se le atribuye un tipo de dato genérico
    private T dato;

    //Métodos get y set
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

}