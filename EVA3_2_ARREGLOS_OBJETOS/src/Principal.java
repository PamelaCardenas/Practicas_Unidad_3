/*
 * Uso de arreglos de una dimensión, el cual será llenado con nombres y edades de personas
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
        Persona[] apAlumnos = new Persona[5];
        for (int i = 0; i < apAlumnos.length; i++) {
            apAlumnos[i] = new Persona("Juan Perez");
        }
        for (int i = 0; i < apAlumnos.length; i++) {
            apAlumnos[i].imprimir();
        }
    }
    
}

class Persona{
    public String nombre;
    public void imprimir(){
        System.out.println(nombre);
    }
    public Persona(String nombre){
    this.nombre = nombre;
}
}
