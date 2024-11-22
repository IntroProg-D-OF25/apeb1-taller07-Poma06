/***
 * Realizar un programa Java que permita presentar en pantalla 
 * la siguiente secuencia: 5/10, 10/12, 15/14,..., n
 */
import java.util.Scanner;
public class Problema2_SerieNumero2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite, cont = 5, deno = 10;
        System.out.print("DAME EL LIMITE: ");
        limite = teclado.nextInt();
        while (cont <= (limite *5)){
            System.out.print(cont + "/" + deno+", ");
            cont += 5;
            deno += 2;
            
        }
        System.out.println("");
    }
    
}

/**
 * DAME EL LIMITE: 5
 * 5/10, 10/12, 15/14, 20/16, 25/18
 */