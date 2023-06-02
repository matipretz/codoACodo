package S2W;
import java.util.Random;
import java.util.Scanner;

public class S2WFunction {
    int fichasEnJuego = 0;// Variable para operar el resultado de la jugada.
    int jugada;// Variable que almacena el numero elegido para jugar.
    int min = 0;// Establece el parametro minimo del entero.
    int max = 36;// Establece el parametro maximo del entero.
    static String bienvenida = "¡Bienvenido a Spin2Win! ¡El juego de ruleta mas divertido del condado!\nLa casa te invita con 1000 fichas de cortesia.";
    String cuantasFichasJuega = "¿Cuantas fichas queres jugar?";
    String queNumerojuega = "¿Que numero desde el [0] hasta el [36] queres jugar?";
    String errorJugada = "¡Error! Debes introducir un número entero entre el [0] y el [36].\nVolve a intentarlo:";
    String errorOpcion = "Opción inválida. Volve a intentarlo:\n";
    Scanner input = new Scanner(System.in);
    boolean validNumero = false;
    boolean validFichas = false;

    public void tomarNumero() {// Verifica e inicializa el numero elegido para jugar.
        System.out.println(queNumerojuega);
        while (!validNumero) {
            if (input.hasNextInt()) {
                jugada = input.nextInt();
                if (jugada > min && jugada <= max) {
                    validNumero = true;
                } 
                else {
                    System.out.println(errorJugada);
                }
            } 
            else {
                input.next();
                System.out.println(errorJugada);
            }
        }
    }

    public void tomarFichas() {// Verifica e inicializa la cantidad de fichas que se quieren jugar.
        System.out.println(cuantasFichasJuega);
        while (!validFichas) {
            if (input.hasNextInt()) {
                fichasEnJuego = input.nextInt();
                input.nextLine();
                if (fichasEnJuego > 0 && fichasEnJuego <= S2.fichas) {
                    validFichas = true;
                } 
                else {
                    System.out.println("No tenes esa cantidad. Tenes " + S2.fichas + " fichas.\nVolve a intentarlo:");
                }
            } 
            else {
                input.next();
                System.out.println("¡Error! Tenes: " + S2.fichas + " fichas.\nVolve a intentarlo:");
            }
        }
    }

    public void tirada() {
        Random x = new Random();
        int ruleta = x.nextInt(37);
        if (jugada == ruleta) {
            S2.fichas = S2.fichas + (fichasEnJuego * 35);
            System.out.println("¡Acertaste! Salio el numero " + ruleta+ "¡Tus fichas jugadas se multiplican por 35! Ahora tenés " + S2.fichas + " fichas.\n¿Queres volver a jugar?[s]/[n]");
            input.nextLine();
        } 
        else {
            S2.fichas = S2.fichas - fichasEnJuego;
            System.out.println("Lo lamento, perdiste. Salio el numero " + ruleta + " Ahora tenés " + S2.fichas
                    + " fichas.\n¿Queres voler a intentarlo? [s]/[n]");
        }
    }

    public void opcionM() {
        String opcion = input.nextLine();
        if (opcion.equalsIgnoreCase("s")) {
            S2.juego();
        }
        if (opcion.equalsIgnoreCase("n")) {
            System.out.println(
                    "Muchas gracias por jugar a Spin2Win, la ruleta mas divertida del condado. Te llevas un total de " + S2.fichas + " fichas. \nPresiona [Enter] para salir.");
            input.nextLine();
            System.exit(0);
        } 
        else {
            System.out.println(errorOpcion);
        }
    }
}