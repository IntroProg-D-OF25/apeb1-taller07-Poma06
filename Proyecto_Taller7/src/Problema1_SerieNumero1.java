/***
 * Realizar un programa Java que permita presentar en pantalla 
 * la siguiente secuencia: 1/10, 2/11, 3/12, 4/13,..., n
 * 
 */
import java.util.Scanner;
public class Problema1_SerieNumero1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite, cont =1;
        System.out.print("INGRESA EL LIMITE: ");
        limite = teclado.nextInt();
        while (cont <= limite){
            System.out.print(cont + "/" + (cont+9) + ", ");
            cont++;
        }
    }
    
}

/***
 * INGRESA EL LIMITE: 10
 * 1/10, 2/11, 3/12, 4/13, 5/14, 6/15, 7/16, 8/17, 9/18, 10/19,
 */
