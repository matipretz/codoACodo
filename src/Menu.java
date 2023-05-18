import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() {    
        System.out.println("###############################################################################");
        System.out.println("#                                                                             #");
        System.out.println("#                         CAC INICIAL JAVA 2023                               #");
        System.out.println("#                       Murad Pretz Matias Martin                             #");
        System.out.println("#                             DNI:33366158                                    #");
        System.out.println("#                            Comision: 23438                                  #");
        System.out.println("#                                                                             #");
        System.out.println("#              Coleccion de trabajos para el primer semestre 2023             #");
        System.out.println("#                                                                             #");
        System.out.println("###############################################################################\n");
        System.out.println("                               Menu principal\n");
        System.out.println("Ingrese su opción y presione [ENTER]\n");
        System.out.println("1. Pimer desafio: Mi primer programa");
        System.out.println("2. Segundo desafio: Calificaciones");
        System.out.println("3. Tercer desafio: Validaciones");
        System.out.println("4. Cuarto desafio: Ruleta electronica");
        System.out.println("5. Salir");

        Scanner sc = new Scanner(System.in);
        int caso = sc.nextInt();
        switch (caso) {
            case 1:
                desafio1MiPrimerProgramaJava.def1();
                break;
            case 2:
                desafio2CalificacionDeAlumnos.def2();
                break;
            case 3:
                desafio3Validaciones.def3();
                break;
            case 4:
                System.out.println(S2WFunction.bienvenida);
                Spin2Win.juego();
                break;
            case 5:
                desafio4Arreglos.def4();
                break;
            case 6:
                System.out.println("Presiona [Enter] para salir.");
                sc.nextLine();
                System.exit(0);
            default:
                System.out.println("Opción no válida. Vuelva a intentarlo.");
                menu();
        }   
        sc.close(); 
    }
}