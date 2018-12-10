/*
 * JAVA SOLO MANEJA PASO POR VALOR (SOLO MANEJA COPIAS DE VALORES)
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

        Valor vOb1 = new Valor(); //Creación de objeto
        vOb1.iX = 100; //Asigna un valor
        Valor vOb2 = new Valor(); //Creación de objeto
        vOb2.iX = 500; //Asigna un valor
        
        intercambiar(vOb1, vOb2); //Llama al método mandando las variables
        System.out.println("Obj 1 = " + vOb1.iX); //Muestra el valor
        System.out.println("Obj 2 = " + vOb2.iX); //Muestra el valor
        
       //Intercambio de valores
       Valor vTemp = vOb1; //Nueva variable temporal que toma el valor del objeto1
       vOb1 = vOb2; //Objeto1 toma valor del Objeto2
       vOb2 = vTemp; //Objeto2 toma valor de la variable Temporal
       
       System.out.println("Obj 1 = " + vOb1.iX); //Muestran nuevos valores
       System.out.println("Obj 2 = " + vOb2.iX); //Muestran nuevos valores
        
    }
    public static void intercambiar(Valor v1, Valor v2){ //Método para cambiar valores
       
       Valor vTemp = v1; //Variable Temporal toma valor del Valor1
       v1 = v2; //Valor1 toma el valor de Valor2
       v2 = vTemp; //Valor2 toma el valor de la variable Temporal
    } 
}
 //Clase con un variable
class Valor{
    int iX;
}
