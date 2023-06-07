import S2W.S2;
import desafios.*;
import java.util.Scanner;

public class CAC4 {
    public static void pausa(int tiempo) {//Pausa la ejecucion pasando milisegundos como argumento.    
        try {
            Thread.sleep(tiempo);
            } 
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            }
        }
    public static void main(String[] args) {
        System.out.print("### MENÚ PRINCIPAL ###\nSeleccione un ejercicio:\n 1. Imprimir variables.\n 2. Califcador.\n 3. Certificador.\n 4. Arreglos.\n 5. Metodos.\n 6. Funciones I.\n 7. Funciones II.\n 8. Funciones III.\n 9. Funciones y estructuras de control I.\n10. Funciones y estructuras de control II.\n11. Juego de ruleta.\n12. SALIR.\n>");
        Scanner sc = new Scanner(System.in);
        int caso = sc.nextInt();          
        switch (caso) {
            case 1:
                A_Desafio.desafio1();
                break;
            case 2:
                B_Desafio.desafio2();
                break;
            case 3:                
                C_Desafio.desafio3();
                break;
            case 4:
                D_Desafio.desafio4();
                break;
            /* case 5:
                E_Desafio.desafio5();
                break;
            case 6:
                F_Desafio.desafio6();
                break;
            case 7:
                G_Desafio.desafio7();
                break;
            case 8:
                H_Desafio.desafio8();
                break;
            case 9:
                I_Desafio.desafio9();
                break;
            case 10:
                J_Desafio.desafio10();
                break; */
            case 11:
                S2.welcome();
                break;
            case 12:
                System.out.println("Saliendo...");
                pausa(1000);
                System.exit(0);
            default:
                System.out.println("Opción no válida. Vuelva a intentarlo.");
                break;
            } 
        }
    }