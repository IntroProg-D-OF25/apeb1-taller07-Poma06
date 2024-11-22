/***
 * Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente:
 * Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20% En caso que sea otro tipo de cliente,
 * no hay descuento. Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 */
import java.util.Scanner;
public class Problema6_IngresoVentas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombrecli;
        double costocompu, descuento = 0;
        int cont = 1, tipocliente;
        while (cont <= 7){
            System.out.print("INGRESE EL NOMBRE DEL CLIENTE: ");
            nombrecli = teclado.next();
            System.out.print("INGRESE EL PRECIO DE LA COMPUTADORA: ");
            costocompu = teclado.nextDouble();
            System.out.print("INGRESE EL TIPO DE CLIENTE (SOLO NUMEROS): ");
            tipocliente = teclado.nextInt();
            if (tipocliente == 1){
                System.out.println("Se le otorgara un descuento del 10%");
                descuento = costocompu * 0.90;
            }
            else{
                if (tipocliente == 2){
                    System.out.println("Se le otorga un descuento del 20%");
                    descuento = costocompu * 0.80;
                }
                else {
                    System.out.println("No tiene descuento alguno");
                    descuento = costocompu;
                }
                cont++;
            }
            System.out.println("Cliente tipo " + tipocliente + ", compra computadora con un precio de: " + descuento);            
        }
    }
    
}

/***
 * INGRESE EL NOMBRE DEL CLIENTE: David
 * INGRESE EL PRECIO DE LA COMPUTADORA: 5000
 * INGRESE EL TIPO DE CLIENTE (SOLO NUMEROS): 2
 * Se le otorga un descuento del 20%
 * Cliente tipo 2, compra computadora con un precio de: 4000.0
 */
