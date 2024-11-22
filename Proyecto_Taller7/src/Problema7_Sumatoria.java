/***
 * Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * @author PATO PC
 */
import java.util.Scanner;
public class Problema7_Sumatoria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 0, numerador = 1, deno = 1;
        while (cont < 10){
            if (cont % 2 == 0) { // Alternar signos
                System.out.print("-(1/" + deno + ")");
            } else {
                System.out.print("+(1/" + deno + ")");
            }
            cont++;
            deno++;
            
        }
        System.out.println("");
    }    
}
