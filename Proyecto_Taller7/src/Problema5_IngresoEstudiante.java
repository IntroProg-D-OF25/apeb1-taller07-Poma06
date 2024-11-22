/***
 * Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de ellos ingresar el nombre del estudiante,
 * el promedio de ciclo. Presentar el siguiente reporte
 */
import java.util.Scanner;
public class Problema5_IngresoEstudiante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombrest, estado;
        double promedio, cont = 1;
        while (cont <= 4){
            System.out.println("DAME NOMBRE Y PROMEDIO: ");
            nombrest = teclado.next();
            promedio = teclado.nextDouble();
            estado = (promedio >= 7) ? "APROBADO" : "REPORBADO" ;
            System.out.println("NOMBRE MEDIO  ESTADO");
            System.out.println(nombrest+ "   " + promedio + "   " + estado);
            cont++;
            
            
        }
    }
    
}
