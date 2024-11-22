/***
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 * Nombre el jugador
 * Posición en el campo de juego
 * Edad
 * Estatura
 */
import java.util.Scanner;

public class Problema4_ReporteJugadores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, posicion, continuar;
        int edad, totalJugadores, sumaEdades, contador;
        double estatura, sumaEstaturas, promedioEdades, promedioEstaturas;

        // Inicialización de variables
        totalJugadores = 0;
        sumaEdades = 0;
        sumaEstaturas = 0.0;
        contador = 1;
        
        // Lista para almacenar los datos de los jugadores
        StringBuilder listadoJugadores = new StringBuilder();

        // Solicitar datos
        do {
            System.out.print("INGRESA EL NOMBRE DEL JUGADOR: ");
            nombre = teclado.next();
            System.out.print("INGRESA LA POSICIÓN EN EL CAMPO: ");
            posicion = teclado.next();
            System.out.print("INGRESA LA EDAD DEL JUGADOR: ");
            edad = teclado.nextInt();
            System.out.print("INGRESA LA ESTATURA DEL JUGADOR: ");
            estatura = teclado.nextDouble();

            // Acumular datos para el reporte y promedios
            listadoJugadores.append(contador + ". " + nombre + " -" + posicion + "-, edad " + edad + ", estatura " + estatura + "\n");
            
            totalJugadores++;
            sumaEdades += edad;
            sumaEstaturas += estatura;
            contador++;

            System.out.print("¿DESEAS INGRESAR OTRO JUGADOR? (SI/NO): ");
            continuar = teclado.next();
        } while (continuar.equalsIgnoreCase("SI"));
        
        // Cálculo de promedios
        promedioEdades = (totalJugadores > 0) ? (double) sumaEdades / totalJugadores : 0.0;
        promedioEstaturas = (totalJugadores > 0) ? sumaEstaturas / totalJugadores : 0.0;

        // Mostrar todo el listado de jugadores y los promedios
        System.out.println("Listado de Jugadores");
        System.out.println(listadoJugadores.toString());
        System.out.println("Promedio de edades: " + promedioEdades);
        System.out.println("Promedio de estaturas: " + promedioEstaturas);
    }
}

/*** 
 * INGRESA EL NOMBRE DEL JUGADOR: Messi
 * INGRESA LA POSICIÓN EN EL CAMPO: Delantero
 * INGRESA LA EDAD DEL JUGADOR: 38
 * INGRESA LA ESTATURA DEL JUGADOR: 1.65
 * ¿DESEAS INGRESAR OTRO JUGADOR? (SI/NO): si
 * INGRESA EL NOMBRE DEL JUGADOR: Cristiano
 * INGRESA LA POSICIÓN EN EL CAMPO: Delantero
 * INGRESA LA EDAD DEL JUGADOR: 40
 * INGRESA LA ESTATURA DEL JUGADOR: 1.78
 * ¿DESEAS INGRESAR OTRO JUGADOR? (SI/NO): no
 * Listado de Jugadores
 * 1. Messi -Delantero-, edad 38, estatura 1.65
 * 2. Cristiano -Delantero-, edad 40, estatura 1.78

 * Promedio de edades: 39.0
 * Promedio de estaturas: 1.7149999999999999
 */

