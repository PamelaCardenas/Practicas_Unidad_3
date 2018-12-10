/*
 * Uso de arreglos de una dimensión y llenarlo con edades de estudiantes
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
        //ARREGLOS ES UNA SECUENCIA CONTIGUA DE VARIABLES DEL MISMO TIPO
        //CAPTURAR MUCHOS DATOS DEL MISMO TIPO
        //CAPTURAR EDAD, IMPRIMIR, CALCULAR MEDIA
        //TEC 2 --> 3 MIL ESTUDIANTES (4 bytes) = 12 mil bytes --> 12kb
        //USAMOS UN ARREGLO
        //Tipo de dato [] nombre de identificador = new tipo de dato [tamaño]
        //SON DE ACCESO ALEATORIO
        //ACCESO SECUENCIAL:
        int[] aiEdades = new int[3000];
        //ARREGLOS EN JAVA, C, C++, TIENEN DIRECCIONES PARA CADA 
        //POSICION --> 0 ES LA PRIMERA --> N-1 LA ULTIMA
        //SIENDO N --> TAMAÑO DEL ARREGLO
        System.out.println(aiEdades.length);
        System.out.println("PRIMER POSICIÓN = " + aiEdades[0]);
        System.out.println("ULTIMA POSICIÓN = " + aiEdades[2999]);
        //LLENAR CON EDADES:
        //17 - 40
        for (int i = 0; i < aiEdades.length; i++) {
          int iEdad = (int) (17 + Math.random() * 40)+1;
          aiEdades[i] = iEdad;
        }
        //IMPRIMIR TODO EL ARREGLO:
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println(aiEdades[i]);
        }
        //FOR EACH:
        for (int aiEdade : aiEdades) {
            System.out.println("For each - " + aiEdade);
        }
        //SUMATORIA PARA CALCULAR LA MEDIA
        int iAcum = 0;
        for (int i = 0; i < aiEdades.length; i++) {
            iAcum = iAcum + aiEdades[i];
        }
        System.out.println("La media es: " + (double)(iAcum/3000));
    }
    
}
