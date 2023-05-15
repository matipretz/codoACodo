import java.util.Scanner;

public class cACMenu {
    public static void main(String[] args) throws Exception {
        System.out.println("###############################################################################");
        System.out.println("#                         CAC INICIAL JAVA 2023                               #");
        System.out.println("#                       Murad Pretz Matias Martin                             #");
        System.out.println("#                             DNI:33366158                                    #");
        System.out.println("#                            Comision: 23438                                  #");
        System.out.println("#                                                                             #");
        System.out.println("#                                                                             #");
        System.out.println("#                                                                             #");
        System.out.println("###############################################################################\n");
        System.out.println("                               Menu principal");
        System.out.println("1. Pimer desafio: Mi primer programa");
        System.out.println("2. Segundo desafio: Calificaciones");
        System.out.println("3. Tercer desafio: Validaciones");
        System.out.println("4. Cuarto desafio: Ruleta electronica");
        Scanner sc = new Scanner(System.in);
        int caso = sc.nextInt();
        switch (caso) {
            case 1:
                System.out.println("Caso 1");
            break;
            case 2:
                System.out.println("Caso 2");
                break;
            case 3:
                System.out.println("Caso 3");
                break;
            case 4:
                System.out.println(S2WFunction.bienvenida);
                Spin2Win.juego();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }    
    }
}

