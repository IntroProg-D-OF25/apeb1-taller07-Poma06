/***
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados.
 * Por cada empleado se debe solicitar el nombre, 
 * numero de días trabajados y costo del día trabajo.
 * Calcular el valor a cancelar por la empresa para cada empleado.
 * @author PATO PC
 */
import java.util.Scanner;
public class Problema3_Reporte {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int dias, cont = 1;
        double costo, total;
        while (cont <= 5){
            System.out.print("INGRESA LOS NOMBRE: ");
            nombre = teclado.next();
            System.out.print("INGRESA EL NUMERO DE DIAS TRABAJADOS: ");
            dias = teclado.nextInt();
            System.out.print("INGRESA EL COSTO DEL DIA DE TRABAJO: ");
            costo = teclado.nextDouble();
            System.out.println("NOMBRE   DIAS   COSTO   TOTAL");
            System.out.println(nombre + "     " + dias + "     " + costo + "     " + (dias * costo));
            cont++;
        }
    }
    
}
