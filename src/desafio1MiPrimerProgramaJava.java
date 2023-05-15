import java.util.Scanner;

public class desafio1MiPrimerProgramaJava {

  public static void def1() {
    System.out.println("############################### MiPrimerProgramaJava ##########################");
    System.out.println("#                                                                             #");
    System.out.println("# 1. Inicializar un programa java con nombre de clase MiPrimerProgramaJava.   #");
    System.out.println("#                                                                             #");
    System.out.println("# 2. Declarar cada tipo de variable aprendida.                                #");
    System.out.println("#                                                                             #");
    System.out.println("# 3. Imprimir su valor por consola                                            #");
    System.out.println("#                                                                             #");
    System.out.println("###############################################################################\n");    
    // Declaracion de variables primitivas:
    Scanner sc = new Scanner(System.in);

    byte byt1, byt2;

    short sho1, sho2;

    int int1, int2;

    long lon1, lon2;

    float flo1, flo2;

    double dou1, dou2;

    char cha1, cha2;

    boolean boo1, boo2;

    // InicializaciC3n de variables primitivas:

    byt1=Byte.MAX_VALUE;byt2=Byte.MIN_VALUE;

    sho1=Short.MAX_VALUE;sho2=Short.MIN_VALUE;

    int1=Integer.MAX_VALUE;int2=Integer.MIN_VALUE;

    lon1=Long.MAX_VALUE;lon2=Long.MIN_VALUE;

    flo1=Float.MAX_VALUE;flo2=Float.MIN_VALUE;

    dou1=Double.MAX_VALUE;dou2=Double.MIN_VALUE;

    cha1='A';cha2='z';

    boo1=true;boo2=false;
    // Salida de valores:
    System.out.println("Byte:\n"+byt1+"\n"+byt2);

    System.out.println("\nShort:\n"+sho1+"\n"+sho2);

    System.out.println("\nInteger:\n"+int1+"\n"+int2);

    System.out.println("\nLong:\n"+lon1+"\n"+lon2);

    System.out.println("\nFloat:\n"+flo1+"\n"+flo2);

    System.out.println("\nDouble:\n"+dou1+"\n"+dou2);

    System.out.println("\nCharacter:\n"+cha1+"\n"+cha2);

    System.out.println("\nBoolean:\n"+boo1+"\n"+boo2);

    System.out.println("Presiona [Enter] para volver al menu principal.");
     sc.nextLine();
     cACMenu.menu();
  }
}