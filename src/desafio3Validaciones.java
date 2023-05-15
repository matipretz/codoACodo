import java.util.Scanner;

public class desafio3Validaciones {

    public static void def3() {
        System.out.println("############################### Validaciones ##################################");
        System.out.println("#                                                                             #");
        System.out.println("# 1. Completar las estructuras faltates para verificar todos los datos.       #");
        System.out.println("#                                                                             #");
        System.out.println("###############################################################################\n");
        Scanner miEscaner = new Scanner(System.in);
        String mayorDe18, realizoEjercicios, asistencia, trabajoFinal;

        do  {
            System.out.println("Sos mayor de 18? [s / n]");
            mayorDe18 = miEscaner.nextLine();
            if (!mayorDe18.equalsIgnoreCase("s") && !mayorDe18.equalsIgnoreCase("n")) {
                System.out.println("Respuesta inválida");
            }
        }
            while(!mayorDe18.equalsIgnoreCase("s")&&!mayorDe18.equalsIgnoreCase("n"));

        do  {
            System.out.println("Realizaste los ejercicios obligatorios y el examen final? [s / n]");
            realizoEjercicios = miEscaner.nextLine();
            if (!realizoEjercicios.equalsIgnoreCase("s") && !realizoEjercicios.equalsIgnoreCase("n")) {
                System.out.println("Respuesta inválida");
            }
        }
        while(!realizoEjercicios.equalsIgnoreCase("s")&&!realizoEjercicios.equalsIgnoreCase("n"));

        do  {
            System.out.println("Tu asistencia es mayor o igual a 65% de las clases? [s / n]");
            asistencia = miEscaner.nextLine();
            if (!asistencia.equalsIgnoreCase("s") && !asistencia.equalsIgnoreCase("n")) {
                System.out.println("Respuesta inválida");
            }
        }while(!asistencia.equalsIgnoreCase("s")&&!asistencia.equalsIgnoreCase("n"));

        do  {
            System.out.println("Realizaste el Trabajo Final Obligatorio? [s / n]");
            trabajoFinal = miEscaner.nextLine();
            if (!trabajoFinal.equalsIgnoreCase("s") && !trabajoFinal.equalsIgnoreCase("n")) {
                System.out.println("Respuesta inválida");
            }
        }
        while(!trabajoFinal.equalsIgnoreCase("s")&&!trabajoFinal.equalsIgnoreCase("n"));
        
        if(mayorDe18.equalsIgnoreCase("s")&&realizoEjercicios.equalsIgnoreCase("s")&&asistencia.equalsIgnoreCase("s")&&trabajoFinal.equalsIgnoreCase("s"))  {
            System.out.println("Tomá tu diploma: te lo ganaste.");
        }
        else    {
            System.out.println("Lo lamento, pero todavía no podés recibir el diploma. =(");
        }
        System.out.println("Presiona [Enter] para volver al menu principal.");
        miEscaner.nextLine();
        cACMenu.menu();
    }
}