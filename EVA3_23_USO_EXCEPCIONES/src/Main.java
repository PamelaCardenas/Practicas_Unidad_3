/*
 * Excepción al intentar introducir números negativos en un salario
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
        Empleado eEmp = new Empleado(); //Nuevo Objeto
        //Asignan valores
        eEmp.setNombre("Juan");
        eEmp.setApellido("Perez");
        
        try { //Posible error en el siguiente comando
            eEmp.setSalario(-1000.0); //Salario es igual a -1000
        } catch (Exception ex) { //Excepción
            ex.printStackTrace(); //Imprime el error
        }
        //Imprime los valores
        System.out.println("Nombre = " + eEmp.getNombre());
        System.out.println("Apellido = " + eEmp.getApellido());
        System.out.println("Salario = " + eEmp.getSalario());
    }
}

class Empleado{ //Clase Empleado
    //Atributos
    private String nombre;
    private String apellido;
    private double salario;

    //Métodos get y set
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

    public double getSalario() {
        return salario;
    }

    //Método set de salario que cuenta con una excepción
    public void setSalario(double salario) throws Exception {
        if (salario < 0){ //SALARIOS NEGATIVOS
            throw new Exception ("No se permiten salarios negativos");
        }
        this.salario = salario;
    }
    
}
