/*
 * Tipos de datos genéricos
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
        //Objeto de Persona en donde se le asignan los tipos de datos requieridos para los atributos indicados en la clase
        Persona <String, Double>pObj = new Persona();
        //Se asignan los valores de los atributos
        pObj.setNombre("Juan");
        pObj.setApellido("Perez");
        pObj.setClave("11223344");
        
        //Objeto de Persona en donde se le asignan los tipos de datos requieridos para los atributos indicados en la clase
        Persona <Integer, Boolean>pObjEntero = new Persona();
        //int Integer
        //double Double
        //Se asignan los valores de los atributos
        pObjEntero.setNombre("Yo");
        pObjEntero.setApellido("Cárdenas");
        pObjEntero.setClave(100);
        
        
    }
    
}

class Persona<T, S>{ //Clase Persona a la que se le asignan tipos de datos genéricos para luego cambiarlo luego en el atributo
    //Atributos
    private String nombre;
    private String apellido;
    private T clave; //Tipo de dato genérico (La T se sustituye con cualquier tipo de dato)
    private S otroDato;

    //Métodos get y set de los atributos
    public S getOtroDato() {
        return otroDato;
    }

    public void setOtroDato(S otroDato) {
        this.otroDato = otroDato;
    }
    
    public T getClave() {
        return clave;
    }

    public void setClave(T clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}