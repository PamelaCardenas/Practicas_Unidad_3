/*
 * Uso de arreglos, herencia y objetos
 * Asignar valores a un arreglo dependiendo de si es empleado o alumno
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
        Persona[] apTodos = new Persona[10]; //Arreglo
        //Cada dato se distingue por alumno o empleado
        apTodos[0] = new Alumno();
        apTodos[1] = new Alumno();
        apTodos[2] = new Alumno();
        apTodos[3] = new Alumno();
        apTodos[4] = new Alumno();
        apTodos[5] = new Empleado();
        apTodos[6] = new Empleado();
        apTodos[7] = new Empleado();
        apTodos[8] = new Empleado();
        apTodos[9] = new Empleado();
        
        String mnsAlumnos = "";
        String mnsEmpleado = "";
        
        for (int i = 0; i < apTodos.length; i++) { //Recorre el arreglo
            //SI ES ALUMNO LLENARLO CON JUAN PEREZ Y 0011
            //SI ES EMPLEADO LLENARLO CON PEDRO PARAMO Y 1000
            
            if(apTodos[i] instanceof Alumno){ //Si el arreglo pertenece a alumno
                //Se asignan los valores correspondientes
                Alumno aObj = (Alumno)apTodos[i];
                aObj.nombre = "Juan";
                aObj.apellido = "Perez";
                aObj.noControl = "0011"; 
                //Se asignan a una cadena de texto
                mnsAlumnos += aObj.nombre  + " " + aObj.apellido + " " + aObj.noControl + "\n";
            }
            else{ //Si es de Empleado
                //Se asignan los valores correspondientes
                Empleado aObj2 = (Empleado)apTodos[i];
                aObj2.nombre = "Pedro";
                aObj2.apellido = "Paramo";
                aObj2.claveEmpleado = 1000;
                //Se asignan a una cadena de texto
                mnsEmpleado += aObj2.nombre  + " " + aObj2.apellido + " " + aObj2.claveEmpleado + "\n";
            }
        }
        
        //Se despliegan las cadenas de texto
        System.out.println(mnsAlumnos);
        System.out.println(mnsEmpleado);
        
    }
    
}
class Empleado extends Persona{ //Clase Empleado que hereda de persona
    int claveEmpleado; //Variable
}

class Alumno extends Persona{ //Clase Alumno que hereda de persona
    String noControl; //Variable
}

class Persona{ //Clase Persona (Padre) 
    //Atributos
    String nombre;
    String apellido;
}